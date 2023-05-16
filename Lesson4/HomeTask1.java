package Lesson4;
// Задача 1 Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;
import java.util.Random;

public class HomeTask1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Random rd = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(i, rd.nextInt(1, 100));
        }
        System.out.println((list));
        System.out.println(reverse(list));
    }

    public static LinkedList<Integer> reverse(LinkedList<Integer> list) {

        LinkedList<Integer> list2 = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            list2.add(list.get(i));
        }
        return list2;
    }
}

