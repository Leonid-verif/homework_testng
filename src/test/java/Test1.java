package test.java;

import main.java.Task1;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Test
public class Test1 {
    public static void getNamesTest() {
        int expectedResult = 5;
        String actualResult = Task1.getNames();
        String strArr[] = actualResult.split("\n");
        assertEquals(strArr.length,expectedResult, String.format("Expected value to be %d , but actual was %d", expectedResult, strArr.length));
    }

    public static void getNamesTest1() {
        int expectedResult = 10;
        String actualResult = Task1.getNames();
        String strArr[] = actualResult.split("\n");
        for (String el : strArr) {
            String namesArr[] = el.split(" ");
            System.out.println("Names is line amount: " + namesArr.length);
            assertEquals(namesArr.length,expectedResult, String.format("Expected value to be %d , but actual was %d", expectedResult, namesArr.length));
        }
    }
}



