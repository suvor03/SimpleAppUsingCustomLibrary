package org.example;

import ru.vsu.cs.suvorov_d_a.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Демонстрация работы с двусвязным списком!");
        workWithDoublyLinkedList();
    }

    private static void workWithDoublyLinkedList() {
        DoublyLinkedList list = new DoublyLinkedList();

        list.addFirst("Start");
        list.addAfter("Start", 1);
        list.addAfter(1, 2);
        list.addAfter(2, 3);
        list.addLast("End");
        list.addBefore("End", 4);

        System.out.println(list);
        System.out.println("Длина списка = " + list.size());

        list.remove("Start");
        list.remove("End");
        System.out.println(list);
    }

}
