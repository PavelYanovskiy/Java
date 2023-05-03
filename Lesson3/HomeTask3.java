package Lesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Задача 3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое этого списка.
public class HomeTask3 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(10); //создаем новый массив определенного размера
        Random rd = new Random();
            
        for (int i = 0; i < 10; i++) {  //заполняем массив случайными числами в заданном диапазоне
            numbers.add(i, rd.nextInt(1, 100));
        }
        System.out.println(numbers); //выводим получившийс список чисел

        int min = numbers.get(0);
        int max = numbers.get(0);
        int avg = numbers.get(0);

        for (int i = 0; i < numbers.size(); i++) { //проходимся по списку и находим минимальный и максимальный элементы

            int temp = 0;
            temp = numbers.get(i);
            if (temp < min) {
                min = temp;
            }
            if (temp > max) {
                max = temp;
            }
            avg += temp;
        }
        avg = avg/numbers.size(); //вычисляем среднее арифметическое, разделив сумму на количество элементов.
        
        System.out.printf("Найденные числа: минимальное - %d, максимальное - %d, среднее арифметическое - %d ", min, max, avg);
    }
    
}
