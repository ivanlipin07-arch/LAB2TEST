package org.example.src.Task_6;

public class Task6 {

    public static class Item {
        public String ball;
        public int size;
    }

    public static Item[] getSortedArray(Item[] array, String key) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {


                if (key.equals("size") && array[j].size > array[j + 1].size) {
                    Item temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }


                if (key.equals("ball") && array[j].ball.compareTo(array[j + 1].ball) > 0) {
                    Item temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}