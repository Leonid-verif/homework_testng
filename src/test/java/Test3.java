package test.java;

import main.java.Task3;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
@Test
public class Test3 {
    public static void reverseTest1() {
        String actualResult = "Test";
        String expectedResult = Task3.reverseString("Test");
        System.out.println(expectedResult);
        assertTrue(expectedResult.equals("tseT"), String.format("Expected value to be 'tseT' , but actual was %s", actualResult));

    }

    public static void reverseTest2() {
        String expectedResult = Task3.reverseString("Test");
        System.out.println(expectedResult);
        int ls = expectedResult.length();
        System.out.println(ls);
        assertTrue(ls == 4);
    }

    public static void reverseTest3() {
        String actualResult = "Test";
        String expectedResult = Task3.reverseString("Test");
        System.out.println(expectedResult);
        assertTrue(expectedResult.startsWith("t"));

    }
}