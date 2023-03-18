package DZ_04;

import java.util.LinkedList;

//   Реализуйте очередь с помощью LinkedList со следующими методами:
// • enqueue() — помещает элемент в конец очереди,
// • dequeue() — возвращает первый элемент из очереди и удаляет его,
// • first() — возвращает первый элемент из очереди, не удаляя.

public class Task_2 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("1");
        ll.add("2");
        ll.add("3");
        ll.add("4");
        ll.addLast("5"); // помещает элемент в конец очереди
        System.out.println(ll.pollFirst()); //выводим 1 элемент и удаляем его
        System.out.println(ll.getFirst()); // выводим первый элемент не удаляя его
        System.out.println(ll);
    }
}
