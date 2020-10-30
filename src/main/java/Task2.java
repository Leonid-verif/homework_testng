package main.java;

public class Task2 {

    public static int minNumber(int a, int b, int c) {
        return a <= b && a <= c ? a : b <= a && b <= c ? b : c;
    }
}