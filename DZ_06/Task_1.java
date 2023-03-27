package DZ_06;

import java.util.*;

/*Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы. Реализовать в Java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.
Критерии фильтрации можно хранить в Map. Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объём ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев — сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям. */

public class Task_1 {
    public static void main(String[] args) {
        List<Laptop> list = new ArrayList<>();
        Laptop n1 = new Laptop("white", 32, "windows", 1000);
        Laptop n4 = new Laptop("black", 16, "MacOS", 1000);
        Laptop n2 = new Laptop("gray", 8, "Linux", 500);
        Laptop n3 = new Laptop("white", 8, "Linux", 2000);
        Collections.addAll(list, n1, n2, n3, n4);

        Scanner scanner = new Scanner(System.in);
        Map<String, String> mapSorting = new HashMap<>();
        mapSorting.put("color", null);
        mapSorting.put("ram", null);
        mapSorting.put("oSystem", null);
        mapSorting.put("hdCapacity", null);
        while (true) {
            System.out.print("""           
            Введите параметры сортировки:
            1 - Цвет
            2 - Обьем HDD
            3 - Операционная система
            4 - Обьем ОЗУ
            5 - Закончить ввод данных и начать поиск
            6 - Выйти из программы
            =>\s""");
            int countSorting = scanner.nextInt();
            try {
                switch (countSorting) {
                    case 1 -> {
                        System.out.println("Доступные цвета: black, white, gray");
                        mapSorting.put("color", scanner.next());
                    }
                    case 2 -> {
                        System.out.println("Доступные обьемы жестких дисков: 500, 1000, 2000");
                        mapSorting.put("hdCapacity", scanner.next());
                    }
                    case 3 -> {
                        System.out.println("Доступные операционные системы: Linux, MacOS, Windows");
                        mapSorting.put("oSystem", scanner.next());
                    }
                    case 4 -> {
                        System.out.println("Доступные обьемы озу: 8, 16, 32");
                        mapSorting.put("ram", scanner.next());
                    }
                    case 5 -> {
                        System.out.println("Введенные параметры поиска\n" + mapSorting + "\n");
                        sortingColor(list, mapSorting);
                        sortingHDD(list, mapSorting);
                        sortingOS(list, mapSorting);
                        sortingRam(list, mapSorting);
                        if (list.size() == 0) System.out.println("По вашему запросу ничего не найдено.");
                        else for (Laptop item : list) System.out.println(item);
                    }
                    case 6 -> {
                        scanner.close();
                        System.exit(0);
                    }
                }
            } catch (Exception e) {
                System.out.println("Введены некоректные данные");
            }
        }
    }
    public static void sortingColor(List<Laptop> list, Map<String, String> map) {
        if (map.get("name") != null) {
            String temp = map.get("name").toLowerCase(Locale.ROOT);
            list.removeIf(item -> !temp.equals(item.getColor()));
        }
    }

    public static void sortingOS(List<Laptop> list, Map<String, String> map) {
        if (map.get("cpu") != null) {
            String temp = map.get("cpu").toLowerCase(Locale.ROOT);
            list.removeIf(item -> !temp.equals(item.getoSystem()));
        }
    }

    public static void sortingHDD(List<Laptop> list, Map<String, String> map) {
        if (map.get("ram") != null) {
            int temp = Integer.parseInt(map.get("ram"));
            list.removeIf(item -> temp < item.getHdCapacity());
        }
    }

    public static void sortingRam(List<Laptop> list, Map<String, String> map) {
        if (map.get("ram") != null) {
            int temp = Integer.parseInt(map.get("ram"));
            list.removeIf(item -> temp < item.getRam());
        }
    }
}

