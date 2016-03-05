package ru.levelp;

/**
 * Created by natalie on 04.03.16.
 */
public class Main {

    public static void main(String[] args) {

//        int[] array = new int[10];
//        System.out.println(array[2]);  // выведет "0" - примитив заполняется нулями автоматически

//        Student[] students = new Student[10]; // в памяти выделяется место под объект
//        System.out.println(students[4].name); // null pointer exception
//        students[1] = new Student[10];
//
//        Student peter; // пока поле не заполнено, оно хранит null
//        Student peter = new Student();
//        peter.name = "Peter";
//        Student anna;
//        anna = peter; // здесь лежат ссылки на объект
//        System.out.println(anna.name);
//
//        peter.name = "Anna";
//        System.out.println(anna.name + " " + peter.name);


        // КОЛЛЕКЦИИ

//        int[] array = new int[10];
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random()*100-50);
//        }
//
//        // делаем динамический массив
//
//        int[] temp = new int[array.length+1];  // создаем новый массив на 1 элемент длиннее
//        for (int i = 0; i < array.length; i++) { // заполняем его старыми данными
//            temp[i] = array[i];
//        }
//        array = temp; // ссылка array пусть ссылается на массив temp
//
//        array[10] = 1000; // тут уже ошибка, последний индекс = 9
//        for (int i = 0; i < 11; i++) {
//            System.out.println(array[i]);
//        }

//        СБОРЩИК МУСОРА - удаляет все объекты, на которые больше нет ни одной ссылки
//        У нас в памяти остался объект array[10], на который больше нет ссылок
//        JAVA делает это автоматически!

//        int[] array = new int[3];

        MyArrayList list = new MyArrayList();
        list.add(55);
        list.add(93);
        list.add(34);

//        // 55 93 34
        list.insert(1, 48);
//        // 55 48 93 34
        list.remove(1);
//        // 55 48 93
//
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }
}
