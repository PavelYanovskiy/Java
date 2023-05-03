import java.util.Scanner;

//Задание 1
// Дано четное число N (>0) и символы c1 и c2.
// Написать метод, который вернет строку длины N, которая состоит из
// чередующихся символов c1 и c2, начиная с c1.

public class Task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите четное число > 0"); //просим ввести длину
        int lenght = iScanner.nextInt();

        System.out.println("Введите число с1: "); //первое число
        int numsC1 = iScanner.nextInt();

        System.out.println("Введите число с2:");
        int numsC2 = iScanner.nextInt();
        iScanner.close();

        System.out.println(massiv(lenght, numsC1, numsC2));
    }

    public static String massiv(int a, int b, int c) { //функция принимает три аргумента
        StringBuilder str = new StringBuilder(); //создается стрингбилдер
        for (int i = 0; i < a; i++) { //через цикл проверяет числа
            if (i % 0 == 0) { //если нечетный то первый, если четный то второй
                str.append(b);
            } else {
                str.append(c);
            }
        }
        return str.toString(); //стрингбилдер переводим в строку и возвращаем
    }
}

