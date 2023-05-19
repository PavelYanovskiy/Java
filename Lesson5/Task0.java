package Lesson5;

import java.util.HashMap;
import java.util.Map;
//Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
//вывести данные по сотрудникам с фамилией Иванов.

public class Task0 {
    public static void main(String[] args) {
        Map<Integer, String> passportToLastName = new HashMap<> ();  //создаем структуру для хранения базы данных
        passportToLastName.put (123456, "Иванов"); //вводим уникальный ключ и значение
        passportToLastName.put (321456, "Васильев");
        passportToLastName.put (234561, "Петрова");
        passportToLastName.put (234432, "Иванов");
        passportToLastName.put (654321, "Петрова");
        passportToLastName.put (345678, "Иванов");
    
        System.out.println(passportToLastName); //выводим список

        // для каждого чего-то из коллекции моего словаря, слева пишется пара ключ-значение
        // мэп это класс внутри класса и эетри - ключ-значение плюс делаем операци. 
        //энтри сэт чтобполучить набор всех пар ключ-значение и для каждой пары мы говорим что делать
        for (Map.Entry<Integer, String> pair : passportToLastName.entrySet()) {
            //System.out.println(pair);
            if (pair.getValue().equals ("Иванов")) //делаем фильтр - если фамилия = Иванов, то выводим
                System.out.println(pair);
        }
    }
}
