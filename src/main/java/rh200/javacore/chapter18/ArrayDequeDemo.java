package rh200.javacore.chapter18;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

    public static void main(String[] args) {
        // создать сторонюю очередь

        ArrayDeque<String> adq = new ArrayDeque<String>();

        // использовать класс ArrayDeque для организации стека

        adq.push("A");
        adq.push("B");
        adq.push("D");
        adq.push("E");
        adq.push("F");

        System.out.println("Извлечение из стека " );

        while (adq.peek() != null)
            System.out.println(adq.pop() + " ");

            System.out.println();

            // Извлечение из стека ----> F E D B A


    }
}
