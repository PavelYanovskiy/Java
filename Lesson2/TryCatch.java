public class TryCatch {
    public static void main(String[] args) {
        try {  // потенциально взрывоопасный код идёт сюда
            // основной успешный сценарий
            int a = 5, b = 1;
            System.out.println(a / b);
            // if (b == 1)
            //     throw new RuntimeException ("Всё пошло не так как мы планировали");
        }
        catch (ArithmeticException ex) {  // что делать, если ошибка всё же наступила
            System.out.println(ex);  // рассказать об ошибке
        }
        // вернуть ресурсы в систему: закрыть файл
        System.out.println("finally");
    }
}
