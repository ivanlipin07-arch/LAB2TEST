package org.example.src.Task_2;

public class Task2 {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int ostatok = a % b;
            a = b;
            b = ostatok;
        }
        return a;
    }
}
