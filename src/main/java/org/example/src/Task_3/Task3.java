package org.example.src.Task_3;

public class Task3 {
    public static int minDigit(int x) {
        if (x==0) {
            return 0;
        }
        int min = 9;
        while (x>0) {
            int digit = x%10;
            if (digit<min) {
                min = digit;
            }
            x/=10;
        }
        return min;

    }
}
