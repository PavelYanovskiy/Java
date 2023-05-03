//Задача 2 Реализуйте алгоритм сортировки пузырьком числового массива, 
//результат после каждой итерации запишите в лог-файл.
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class HomeTask2 {
    public static void main(String[] args) throws IOException {
        int[] arrInput = { 1, 54, 2, 6, 7, 9, 53, 23 };

        Logger logger = Logger.getLogger(HomeTask2.class.getName());
        FileHandler fh = new FileHandler("log_HomeTask2");
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.info(Arrays.toString(arrInput));
        logger.addHandler(fh);

        int arrLen = 1;
        int temp1 = 0;

        for (int j = 0; j < arrInput.length - 1; j++) {

            for (int i = 0; i < arrInput.length - arrLen; i++) {
                if (arrInput[i] > arrInput[i + 1]) {
                    temp1 = arrInput[i];
                    arrInput[i] = arrInput[i + 1];
                    arrInput[i + 1] = temp1;
                }
            }
            logger.info(Arrays.toString(arrInput));
            arrLen++;
        }
        System.out.println(Arrays.toString(arrInput));
    }
}

