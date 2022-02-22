package rh200.javacore.chapter18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {

    public static void main(String[] args) {

        // создать списочный массив
        ArrayList<String> a1 = new ArrayList<String>();

        // ввести элементы в списочный массив
        a1.add("C");
        a1.add("A");
        a1.add("E");
        a1.add("B");
        a1.add("D");
        a1.add("F");

        //использовать итераторы для вывода содержимого списочного массива a1

        System.out.println("Исходное содержимое списочного массива a1: ");
        Iterator<String> itr = a1.iterator();
        while (itr.hasNext()){
            String element = itr.next();
            System.out.println(element + "");
        }
        System.out.println();

        //видоизменить перебираемые обьекты
        ListIterator<String> litr = a1.listIterator();
        while (litr.hasNext()){
            String element = litr.next();
            litr.set(element + " + ");
        }

        System.out.println("Измененное содержимое списочного массива a1: ");
        itr = a1.iterator();
        while(itr.hasNext()){
            String element = itr.next();
            System.out.println(element + " ");
        }

        System.out.println();

        // а теперь отобразить список в обратном порядке

        System.out.println("Измененный в обратном порядке список: ");
        while(litr.hasPrevious()) {
            String element = litr.previous();
            System.out.println(element + " ");
        }

        System.out.println();

 }
}


// Исходное содержимое списочного массива a1: C A E B D F
// Измененное содержимое списочного массива a1: C+ A+ E+ B+ D+ F+
// Измененный в обратном порядке список: F+ D+ B+ E+ A+ C+