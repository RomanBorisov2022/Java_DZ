package DZ_05;

import java.io.BufferedReader;
import java.io.Console;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;

// Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов
// Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. 
// Отсортировать по убыванию популярности.


public class Task_2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        File file = new File("doc.txt");

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8")))
        {
            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(list);
        System.out.println("____________________");
  
        List<String> newList = new ArrayList<>();
        for (String string : list) {
            String[] tempArray = string.split(" ");
            // System.out.println(string.split(" "));
            newList.add(tempArray[0]);
        }
        System.out.println(newList);
        
        Map<String, Integer> frequency = newList.stream().collect(Collectors.toMap(e -> e, e -> 1, Integer :: sum));
        System.out.println("____________________");
        frequency.forEach((k, v) -> System.out.println(k + ": " + v));

        SortedSet<Map.Entry<String, Integer>> sorted = new TreeSet<>(
            Map.Entry.<String, Integer>comparingByValue().reversed()
            .thenComparing(Map.Entry.comparingByKey())
        );
        sorted.addAll(frequency.entrySet());
        System.out.println(sorted);
    }
}

