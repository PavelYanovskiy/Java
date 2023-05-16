package Lesson4;

import java.util.LinkedList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                String input = scanner.nextLine();

                if (input.equals("print")) {
                    while (!strings.isEmpty()) {
                        System.out.println(strings.removeLast());
                    }
                } else if (input.equals("revert")) {
                    if (!strings.isEmpty()) {
                        strings.removeLast();
                    }
                } else {
                    strings.addLast(input);
                }
            }
        }
    }

}
