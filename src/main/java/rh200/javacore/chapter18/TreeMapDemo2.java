package rh200.javacore.chapter18;


import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class TComp implements Comparator<String> {


    public int compare(String aStr, String bStr) {

        int i, j, k;

        // Компаратор сравнивающий фамилии вкладчиков
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        k = aStr.substring(i).compareTo(bStr.substring(j));


        if (k == 0)
            return aStr.compareTo(bStr);
        else return k;

    }


    public class TreeMapDemo2 {

        public static void main(String[] args) {

            TreeMap<String, Double> tm = new TreeMap<String, Double>(new TComp());

            tm.put("A", new Double(1.0));
            tm.put("B", new Double(2.0));
            tm.put("C", new Double(3.0));
            tm.put("D", new Double(4.0));
            tm.put("E", new Double(5.0));

            //получить множество записей
            Set<Map.Entry<String, Double>> set = tm.entrySet();

            //вывести множество записей
            for (Map.Entry<String, Double> me : set) {
                System.out.print(me.getKey() + ": ");
                System.out.println(me.getValue());
            }
            System.out.println();

            //внести сумму 1000 на счет Джон Доу
            double balance = tm.get("A");
            tm.put("A", balance + 1000);
            System.out.println("Новый остаток на счете A : " + tm.get("A"));
            tm.get("A");


        }
    }
}
