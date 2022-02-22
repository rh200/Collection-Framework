package rh200.javacore.chapter18;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        //создать древовидное множество типа TreeSet

        TreeSet<String> ts = new TreeSet<>();

        // ввести элементы в древовидное множество типо TreeSet

        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        System.out.println(ts);

        // A, B, C, D, E, F


    }
}
