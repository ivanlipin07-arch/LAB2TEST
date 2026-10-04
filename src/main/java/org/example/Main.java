package org.example.src;

import org.example.src.Task_8.Calculator;
import org.example.src.Task_8.PrimeChecker;

public class Main {
    public static void main(String[] args) {
        // 1 часть
        System.out.println("2 + 3 = " + Calculator.add(2, 3));
        System.out.println("10 - 4 = " + Calculator.subtract(10, 4));
        System.out.println("3 * 5 = " + Calculator.multiply(3, 5));
        System.out.println("10 / 2 = " + Calculator.divide(10, 2));
        System.out.println("10 / 0 = " + Calculator.divide(10, 0));

        // 2 часть
        int[] numbers = {1, 2, 3, 4, 5, 9, 11, 15, 17, 20};
        for (int n : numbers) {
            System.out.println("Число " + n + " простое? " + PrimeChecker.isPrime(n));
        }
    }
}