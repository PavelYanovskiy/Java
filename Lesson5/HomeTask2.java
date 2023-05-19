package Lesson5;
//Задача 2. Дан список сотрудников. 
//Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. //
//Отсортировать по убыванию популярности.

import java.util.*;


public class HomeTask2 {
    public class Main {
        public static void main(String[] args) {
            List<String> employees = Arrays.asList(
                    "Иван Иванов",
                    "Светлана Петрова",
                    "Кристина Белова",
                    "Анна Мусина",
                    "Анна Крутова",
                    "Иван Юрин",
                    "Петр Лыков",
                    "Павел Чернов",
                    "Петр Чернышов",
                    "Мария Федорова",
                    "Марина Светлова",
                    "Мария Савина",
                    "Мария Рыкова",
                    "Марина Лугова",
                    "Анна Владимирова",
                    "Иван Мечников",
                    "Петр Петин",
                    "Иван Ежов"
            );
    //используем hashmap чтобы подсчитать количество повторений каждого имени
            Map<String, Integer> nameCount = new HashMap<>(); 
            for (String employee : employees) {
                String name = employee.split(" ")[0];
                nameCount.put(name, nameCount.getOrDefault(name, 0) + 1);
            }
    //список Map.Entry из элементов HashMap и сортируем его по значению в обратном порядке.
            List<Map.Entry<String, Integer>> sortedNames = new ArrayList<>(nameCount.entrySet()); 
            sortedNames.sort(Map.Entry.<String, Integer>comparingByValue().reversed());
    //проходим по отсортированному списку и выводим имена, которые повторяются более одного раза, вместе с количеством повторений.
            for (Map.Entry<String, Integer> entry : sortedNames) {
                if (entry.getValue() > 1) {
                    System.out.println(entry.getKey() + " - " + entry.getValue() + " раз(а)");
                }
            }
        }
    }
    
}
