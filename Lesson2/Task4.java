import java.io.FileWriter;
import java.io.IOException;

//Задача 4 Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и 
//метод, который запишет эту строку в простой текстовый файл, обработайте исключения.


public class Task4 {
    public static void main(String[] args) {
        String text = "TEXT";
        int repeat = 100;
        String result = strRepeat(text, repeat);
        System.out.println(result);
        writeToFile(result);
    }

    private static String strRepeat(String word, int count) {
//        StringBuilder result = new StringBuilder();

//        result.append(word.repeat(count)); // Эквивалент умножения строк, как для Python. //передаем аргумент строка и повторить метод опре

//        result.append(String.valueOf(word).repeat(Math.max(0, count)));
//
//        for (int i = 0; i < count; i++) { //перебор все повторени от нуля до каунт и добавить в результат слово каждый раз
//            result.append(word); 
//        }
//        return result.toString(); //влхврат результата который переведен в строку
        return word.repeat(count);
    }

    private static void writeToFile(String text) { //создаем секретный статический метод который ничего не возвращает получает строку 
        try (FileWriter writer = new FileWriter("text.txt")) { // получаем строку в скобках автоматически файл закрывается
            writer.append(text); //используя файл райтер который обращает к файлу текст добавить переданный метод текст в строке
        } catch (IOException ex) {
            System.out.println("Ошибка записи в файл."); //при возникновении ошибки ловит и выдает на экран
        }

//        FileWriter writer = null;
//        try {
//            writer = new FileWriter("file.txt");
//            writer.append(text);
//        } catch (IOException ex) {
//            System.out.println("Ошибка записи в файл.");
//        } finally {
//            assert writer != null;
//            try {
//                writer.close();
//            } catch (IOException ex) {
//                System.out.println("Ошибка закрытия файла.");
//            }
//        }
    }
}