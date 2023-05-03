package Lesson3;
// Создать список типа ArrayList<String>.
// Поместить в него как строки, так и целые числа. 
// Пройти по списку, найти и удалить целые числа.

import java.util.ArrayList;


public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("world");
        list.add("123");
        list.add("456");
        list.add("789");

        System.out.println("Исходный список: " + list);

        for (int i = 0; i < list.size(); i++) {
            if (isInteger(list.get(i))) {
                list.remove(i);
                i--;
            }
        }

        System.out.println("Список после удаления целых чисел: " + list);
    }

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

