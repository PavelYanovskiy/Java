//Задача 3. Реализовать простой калькулятор


package Lesson1;

import java.util.Scanner;

public class HomeTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: "); //просим пользователя ввести первое число
        double num1 = scanner.nextDouble();
        System.out.print("Введите второе число: "); //просим пользователя ввести первое число
        double num2 = scanner.nextDouble();
        System.out.print("Введите операцию (+, -, *, /): "); //просим пользователя ввести необходимую операцию
        char operator = scanner.next().charAt(0);
        double result = 0;
        switch (operator) { //используем оператор switch, чтобы выполнить соответствующую операцию, 
                            //и сохраняем результат в переменную result. 
            case '+':
                result = num1 + num2;
                break; //оператором break прерываем текущую итерацию
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Ошибка: неверная операция."); //выводим сообщение, если пользователь ввел неверную операцию
                return;
        }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result); // выводим результат
    }


    }

