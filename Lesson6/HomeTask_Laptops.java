package Lesson6;

import java.util.*;

public class HomeTask_Laptops {
   
    public static void main(String[] args) {
        // Создаем список ноутбуков
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop("Lenovo", "ThinkPad X1 Carbon", 1600, 16, 512, "Windows 10", "black"));
        laptops.add(new Laptop("Apple", "MacBook Pro", 2000, 16, 512, "macOS", "silver"));
        laptops.add(new Laptop("Dell", "XPS 13", 1500, 8, 256, "Windows 10", "white"));
        laptops.add(new Laptop("HP", "Spectre x360", 1800, 16, 1, "Windows 10", "gold"));


        // Создаем карту критериев фильтрации
        Map<Integer, String> filterCriteria = new HashMap<>();
        filterCriteria.put(1, "RAM");
        filterCriteria.put(2, "HDD");
        filterCriteria.put(3, "OS");
        filterCriteria.put(4, "Color");

        // Запрашиваем у пользователя критерии фильтрации и их значения
        Map<String, Object> filterValues = new HashMap<>();
        try (Scanner scanner = new Scanner(System.in)) {
            for (Integer key : filterCriteria.keySet()) {
                System.out.println("Введите минимальное значение для критерия " + filterCriteria.get(key) + ":");
                Object value = scanner.nextLine();
                filterValues.put(filterCriteria.get(key), value);
            }
        }
        // Фильтруем ноутбуки по заданным критериям
        Set<Laptop> filteredLaptops = new HashSet<>();
        for (Laptop laptop : laptops) {
            boolean isMatch = true;
            for (String key : filterValues.keySet()) {
                Object value = filterValues.get(key);
                if (key.equals("RAM") && laptop.getRam() < Integer.parseInt(value.toString())) {
                    isMatch = false;
                    break;
                } else if (key.equals("HDD") && laptop.getHdd() < Integer.parseInt(value.toString())) {
                    isMatch = false;
                    break;
                } else if (key.equals("OS") && !laptop.getOs().equals(value.toString())) {
                    isMatch = false;
                    break;
                } else if (key.equals("Color") && !laptop.getColor().equals(value.toString())) {
                    isMatch = false;
                    break;
                }
            }
            if (isMatch) {
                filteredLaptops.add(laptop);
            }
        }

        // Выводим отфильтрованные ноутбуки
        System.out.println("Найденные ноутбуки:");
        for (Laptop laptop : filteredLaptops) {
            System.out.println(laptop);
        }
        
    }
}

class Laptop {
    private String brand;
    private String model;
    private int price;
    private int ram;
    private int hdd;
    private String os;
    private String color;

    public Laptop(String brand, String model, int price, int ram, int hdd, String os, String color) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }

    public Laptop(String string, String string2, int i, int j, String string3, String string4, double d, int k) {
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return brand + " " + model + ", " + price + " $., " + ram + " ГБ ОЗУ, " + hdd + " ГБ ЖД, " + os + ", " + color;
    }
}
