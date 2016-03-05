package ru.levelp;

/**
 * Created by natalie on 05.03.16.
 */
public class MyStack {

    MyArrayList list = new MyArrayList();
    int[] stack;

    public void pop() {
        // удаляет верхний эл-т

        if (stack == null) {
            System.err.println("Error: ArrayList is empty");
        }

        int[] temp = new int[stack.length - 1];

            for (int i = 0; i < stack.length - 1; i++) {
            temp[i] = stack[i];
            }
        stack = temp;
    }

    public int peek() {
        // возвращает верхний эл-т, но не удаляет его

        return stack[stack.length-1];
    }

    public void push(int value) {
        // добавляет наверх
        if (stack == null) {
            stack = new int[1];
            stack[0] = value;
    } else {
        int[] temp = new int[stack.length + 1];
        for (int i = 0; i < stack.length; i++) {
            temp[i] = stack[i];
        }
        temp[temp.length - 1] = value;
        stack = temp;
    }

    }

    public int size() {
        if (stack == null) {
            return 0;
        }
        return stack.length;
    }

    public void clear() {
        int[] temp = new int[0];
        stack = temp;
    }

}
