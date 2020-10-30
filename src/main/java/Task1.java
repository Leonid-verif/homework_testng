package main.java;

public class Task1 {
    public static String getNames() {
        String result = "";
        String s = "Vladimir ";
        for (int i = 0; i < 5; i++) {
            for (int j =0; j<10; j++) {
                result +=s;
            }
            result += "\n";
        }
        return result;
    }
}