import java.util.Scanner;

public class InputTryCatch { //задача рассказывает про повторый ввод в случае ошибки
    public static void main(String[] args) { //заводим фукнцию мейн, чтобы могли протестировать программу
        Scanner scanner = new Scanner (System.in); //сканнер можетсуществовать только в мейн, поэтому передаем его как аргумент
        int a = inputNumber (scanner);
        System.out.println(a);
    }

    private static int inputNumber (Scanner scanner) { //инпут это функция которая считывает число с клавиатуры
        while (true) { //если ошибка, то мы возвращем пользователя в начало, а для этого нужно цикл вайл
            try {
                String line = scanner.nextLine ();
                String[] parts = line.split (" ");
                for (String part : parts)  // для каждой строки part из массива parts
                    System.out.println(part);
                return Integer.parseInt (line);  // throw new Exception ("Такая-то ошибка"); //выход их команды
            }
            catch (Exception ex) {
                System.out.printf("Ошибка ввода: %s\n", ex.getMessage ()); //если поймали ошибку говорим пользователю
            }
            finally {
                // сдать в систему ресурсы, если вы их брали
                // файлы здесь его закрываем 
        }
    }
}
}
