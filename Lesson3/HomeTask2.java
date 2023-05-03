package Lesson3;
//Задача 2. Пусть дан произвольный список целых чисел, удалить из него чётные числа


import java.util.Arrays;
import java.util.Random;

public class HomeTask2 {
    public static void main(String[] args) {
        int[] numbers = new int[10]; //создаем массив с размером на 10 чисел
        Random random = new Random();

            for (int i = 0; i < numbers.length; i++) { // заполненяем массив случайными числами в заданном диапазоне
            numbers[i] = random.nextInt(100);
        }

        System.out.println("Созданый список чисел: " + Arrays.toString(numbers)); //выводим сообщение о создании списка чисел

        
        int oddCount = 0; // удаляем четные числа
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[oddCount] = numbers[i];
                oddCount++;
            }
        }
       
        numbers = Arrays.copyOf(numbers, oddCount); // обрезаем до нечетных чисел

        System.out.println("Удаляем четные числа и получаем: " + Arrays.toString(numbers)); //выводим сообщение со списком чисел  без четных
    }

}
