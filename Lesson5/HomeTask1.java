package Lesson5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomeTask1 {
   //задача 1 Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.   

public class PhoneBook {
    private Map<String, List<String>> phoneBook = new HashMap<>();
//Метод addPhone() добавляет телефон в список телефонов для данного имени. Если список еще не существует, мы создаем новый пустой список.

    public void addPhone(String name, String phone) {
        List<String> phones = phoneBook.getOrDefault(name, new ArrayList<>());
        phones.add(phone);
        phoneBook.put(name, phones);
    }

    public List<String> getPhones(String name) {
        return phoneBook.getOrDefault(name, new ArrayList<>());
    }
//Метод removePhone() удаляет телефон из списка телефонов для данного имени.
    public void removePhone(String name, String phone) {
        List<String> phones = phoneBook.getOrDefault(name, new ArrayList<>());
        phones.remove(phone);
        phoneBook.put(name, phones);
    }
}



}
