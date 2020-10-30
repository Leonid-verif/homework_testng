package main.java;

public class Task3 {

    public static void main(String[] args) {

        String str = "Hello world";
        System.out.println(reverseString(str));
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}