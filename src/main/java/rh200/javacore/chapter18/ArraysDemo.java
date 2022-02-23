package rh200.javacore.chapter18;
import java.util.*;
public class ArraysDemo {


    public static void main(String[] args) {

        //videlit i inicializirovat array
        int array[] = new int[10];
        for (int i = 0; i < 10 ; i++) {
            array[i] = -3 * i;

        }

        // vivesti,otsortirovat i snova vivesti
        System.out.print("Isxodniy massiv ");
        display(array);

        Arrays.sort(array);
        System.out.print("Otsortirovanniy massiv");
        display(array);

        //zapolnit i vivesti soderjimoe
        Arrays.fill(array,2,6,-1);
        System.out.print("Massiv posle .fill(): ");
        display(array);

        //otsortirovat i vivesti soderjimoe
        Arrays.sort(array);
        System.out.print("Massiv posle povtornoy sortivki ");
        display(array);

        System.out.print("Znacheniye -9 naxoditsya na poziciyi  ");

        //vipolnit dvoichniy poisk znacheniya -9
        int index = Arrays.binarySearch(array,-9);
        System.out.print(index);

    }

    static void display(int array[]){

        for (int i : array) {
            System.out.print(i + " ");
            System.out.println();
        }

    }

}


//Isxodniy massiv

//0
//-3
//-6
//-9
//-12
//-15
//-18
//-21
//-24
//-27

//Otsortirovanniy massiv

//-27
//-24
//-21
//-18
//-15
//-12
//-9
//-6
//-3
//0

//Massiv posle .fill():

//-27
//-24
//-1
//-1
//-1
//-1
//-9
//-6
//-3
//0

//Massiv posle povtornoy sortivki
//-27
//-24
//-9
//-6
//-3
//-1
//-1
//-1
//-1
//0

//Znacheniye -9 naxoditsya na poziciyi
//2