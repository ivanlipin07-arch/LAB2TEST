package org.example.src.Task_7;

public class Task7 {
    public static String cesar(String str, int shift, String action) {
        String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        int len = alphabet.length();


        int realShift = shift % len;

        if (action.equals("decode")) {
            realShift = len - realShift;
        }

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int index = alphabet.indexOf(c);


            if (index != -1) {
                int newIndex = (index + realShift) % len;
                result = result + alphabet.charAt(newIndex);
            } else {

                result = result + c;
            }
        }

        return result;
    }
}