//Задача 1
//В файле содержится строка с исходными данными в такой форме:
// {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

// Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
// SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";

// Для разбора строки используйте String.split. Сформируйте новую строку, используя StringBuilder. 
//Значения null не включаются в запрос.


public class HomeTask1 {
    public static void main(String[] args) {
        String input = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";

        String[] parts = input.replaceAll("[{}\"]", "").split(","); //разбиваем исходную строку на части с помощью метода split()

        StringBuilder sql = new StringBuilder("SELECT * FROM students WHERE "); //создаем объект StringBuilder 
        //и начинаем формировать новую строку, 
        //добавляя к ней условия для каждого поля, кроме поля "age", которое содержит значение "null".
        for (String part : parts) {
            String[] keyValue = part.split(":");
            String key = keyValue[0].trim();
            String value = keyValue[1].trim();
            if (!value.equals("null")) {
                sql.append(key).append(" = \"").append(value).append("\" AND ");
            }
        }
        
        sql.delete(sql.length() - 5, sql.length()); // Удаление последнего "AND "

        System.out.println(sql.toString());
    }

}