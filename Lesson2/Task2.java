//Задача 2. Напишите метод, который сжимает строку. 
//Пример: aaaabbbcdd → a4b3cd2


public class Task2 {
    public static void main(String[] args) {
        String line = "aaaabbbcdda";

        System.out.println(compressLine(line));

    }

    private static String compressLine(String line) { 
        StringBuilder str = new StringBuilder();

        int count = 1; //счетчик. первый символ без цифры
        for (int i = 0; i < line.length() - 1; i++) {

            if (line.charAt(i) == line.charAt(i + 1)) count++; //считает до первого различия в стороке
            else {
                str.append(line.charAt(i)); //первый чар как был добавлем
                if (count > 1) str.append(count);
                count = 1; // сборасываем счетчик до единицы
            }
        }
        str.append(line.charAt(line.length() - 1));
        if (count > 1) str.append(count); //чтобы последние символы не терядись - выводим их отдельно

        return str.toString();
    }
}
