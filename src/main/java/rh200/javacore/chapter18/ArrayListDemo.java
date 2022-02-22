package rh200.javacore.chapter18;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();

        System.out.println("Начальный размер списочного массива al: " + al.size());

        // ввести элементы в списочный массив
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1,"A2");

        System.out.println("Размер списочного массива al после ввода элементов" + al.size());

        // Вывести списочный массив
        System.out.println("Содержимое списочного массива a1 : " + al);

        // Удалить элементы из списочного массива
        al.remove("F");
        al.remove(2);

        System.out.println("Размер списочного массива al после удаления элементов " + al.size());
        System.out.println("Содержимое списочного массива al: " + al);
    }
}

// Начальный размер списочного массива al: 0
//Размер списочного массива al после ввода элементов7
//Содержимое списочного массива a1 : [C, A2, A, E, B, D, F]
//Размер списочного массива al после удаления элементов 5
//Содержимое списочного массива al: [C, A2, E, B, D]
