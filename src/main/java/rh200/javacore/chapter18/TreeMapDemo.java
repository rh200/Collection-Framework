package rh200.javacore.chapter18;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {


    public static void main(String[] args) {

        //создать древовидное отображение
        TreeMap<String, Double> tm = new TreeMap<String,Double>();

        //ввести элементы в древовидное отображение

        tm.put("A",new Double(3434.34));
        tm.put("B",new Double(123.22));
        tm.put("C",new Double(1378.00));
        tm.put("D",new Double(99.22));
        tm.put("E",new Double(-19.08));


        //получить множество записей
        Set<Map.Entry<String,Double>> set = tm.entrySet();


        //вывести множество записей
        for (Map.Entry<String,Double> me : set){
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();


        //внести сумму 1000 на счет Джон Доу
        double balance = tm.get("A");
        tm.put("Джон Доу", balance + 1000 );
        System.out.println("Новый остаток на счете A : " + tm.get("A"));
        tm.get("A");
    }
}

//A: 3434.34
//B: 123.22
//C: 1378.0
//D: 99.22
//E: -19.08

//Новый остаток на счете A : 3434.34