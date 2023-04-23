// Задача 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package Lesson1;

import java.util.Scanner;

public class HomeTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: "); //просим пользователя ввести число
        int n = scanner.nextInt(); 


    //вычисляем треугольное число
        int triangularNumber = 0; //инициализируем переменную, чтобы хранить текущее значение треугольного числа
         for (int i = 1; i <= n; i++) { //увеличиваем ее при каждой итерации цикла
                triangularNumber += i;
         }
            System.out.println("n-ое треугольное число " + triangularNumber); //выводим пользователю сообщение и результат

    //вычисляем факториал введеного числа
        int factorial = 1; //инициализируем переменную чтобы хранить екущее значение факториала
        for (int i = 1; i <= n; i++) { // умножаем ее при каждой итерации уцикла
         factorial *= i;
        }
        System.out.println("Факториал = " + factorial); //выводим пользователю сообщение и результат
    }

}
