package rh200.javacore.chapter18;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class AlgorithmsDemo {

    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(-8);
        ll.add(20);
        ll.add(-20);
        ll.add(8);

        // sozdat comparator v obratnom noradke
        Comparator<Integer> r = Collections.reverseOrder();

        // sortirovat s pomoshyu comparator
        Collections.sort(ll,r);

        System.out.println("Отсортирован в обратном порядке: ");

        // vivesti
        for (int i : ll) {
            System.out.println(i + " ");
        }

        System.out.println();

        Collections.shuffle(ll);

        System.out.println("Перетасован ");

        for (int i : ll) {
            System.out.println(i + " ");

        }

        System.out.println();
        System.out.println("Minimum" + Collections.min(ll));
        System.out.println("maksimum "+ Collections.max(ll));

    }
}


//Отсортирован в обратном порядке:
//20
//8
//-8
//-20
//
//Перетасован
//8
//20
//-8
//-20
//
//Minimum-20
//maksimum 20