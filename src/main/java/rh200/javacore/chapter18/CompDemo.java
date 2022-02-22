package rh200.javacore.chapter18;


import java.util.Comparator;
import java.util.TreeSet;

// Компаратор для сравнения символьных строк в обратном порядке
class MyComp implements Comparator<String>{

    public int compare (String a, String b){
        String aStr,bStr;
        aStr = a;
        bStr = b;

        // выполнить сравнение в обратном порядке

        return bStr.compareTo(aStr);

    }

    // переопределять метод equals() не требуется
}


public class CompDemo {


    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<String>(new MyComp());

        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        // вывести элементы из древовидного множества
        for (String element : ts) {
            System.out.print(element + " ");
            System.out.println();
        }


    }
}

// F E D C B A