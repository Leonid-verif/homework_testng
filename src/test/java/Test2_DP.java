package test.java;

import main.java.Task2;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

@Test
public class Test2_DP {
    public static void getNamesTest3() {
        int expectedResult = Task2.minNumber(10,15,18);
        System.out.println(expectedResult);
        assertTrue(expectedResult == 10);
    }


    @Test(dataProvider = "dp")
    public void minNumber (int a, int b, int c, int x) {
        int expectedResult = Task2.minNumber(a,b,c);
        assertEquals(expectedResult,x);
    }

    @DataProvider(name = "dp")
    public Object[][] dataProvider() {
        return new Object[][]{
                {1,3,5,1},
                {-100,198, 20,-100},
                {1,0, 198, 0},
                {1500, 5000, 1500, 1500},
                {99, 99, 99, 99},
        };
    }
}
