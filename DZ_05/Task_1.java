package DZ_05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Pеализуйте структуру телефонной книги с помощью HashMap, 
// учитывая, что 1 человек может иметь несколько телефонов.

public class Task_1 {
    public static void main(String[] args) {
        Map<Integer, String> phoneNumbers = new HashMap<>();
        phoneNumbers.put(13423, "Иванов");
        phoneNumbers.put(214, "Петров");
        phoneNumbers.put(36543, "Сидоров");
        phoneNumbers.put(4141, "Козлов");
        phoneNumbers.put(51353, "Иванов");
        phoneNumbers.put(6153, "Буйнов");
        phoneNumbers.put(71324, "Иванов");
        phoneNumbers.put(86452, "Иванов");
        System.out.println("Введите фамилию сотрудника: ");
        String s = System.console().readLine();
        if (phoneNumbers.containsValue(s)) {
            for (Integer number : phoneNumbers.keySet()) {
                if (phoneNumbers.get(number).equals(s))
                    System.out.println(phoneNumbers.get(number) + " - номер телефона: " + number);
            }
        } else System.out.println(("Нет сотрудника с такой фамилией"));
        
    }
}
