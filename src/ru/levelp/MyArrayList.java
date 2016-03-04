package ru.levelp;

/**
 * Created by natalie on 04.03.16.
 */
public class MyArrayList {

    int[] values;

    public void add(int value) {

        if (values == null) {
            values = new int[1];
            values[0] = value;
        } else {
            int[] temp = new int[values.length + 1];
            for (int i = 0; i < values.length; i++) {
                temp[i] = values[i];
            }
            temp[temp.length - 1] = value;
            values = temp;
        }
    }

    public int get(int index) {
        // отдает n-ный эл-т из массива
        if (values == null) {
            System.err.println("Error: ArrayList is empty");
        }
        return values[index];
    }

    public int size() {

        if (values == null) {
            return 0;
        }
        return values.length;
    }

    public int remove(int index) {
        // удаляет n-ный эл-т из массива - уменьшает размер массива
        // return значение удаленного эл-та

        // до индекса копи, потом копи -1, один эл-т пропускается

            int[] temp = new int[values.length - 1];
            for (int i = 0; i < values[index]; i++) {
                temp[i] = values[i];
            }
            for (int i = values[index + 1]; i < values.length; i++) {
                temp[i] = values[i + 1];
            }
            return values[index];
        }
//
//
//    public void insert(int index, int value) {
//        // добавляет по индексу, остальное сдвигает
//    }

}

