package rh200.javacore.chapter18;

import java.util.LinkedList;



//Простой пример обработки списка почтовых элементов

public class Address {

    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    public Address(String name, String street, String city, String state, String code) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.code = code;
    }

    @Override
    public String toString() {
        return name + "\n" + street + "\n" + city + " " + state + " " + code;
    }
}


class MailList {

    public static void main(String[] args) {

        LinkedList<Address> ml = new LinkedList<Address>();

           //ввести элементы в связный список

            ml.add(new Address("U.J.WEST", "11 Oak Ave","Urbana", "IL","61801"));
            ml.add(new Address("Ralph Baker", "1142 Maple Vane","Mahomet", "IL","61853"));
            ml.add(new Address("Tom Carlton", "865 Elm Est","Champaign", "IL","61820"));


            //вывести элементы в связный список
        for (Address element : ml) {
            System.out.println(element + "\n");
        }

        System.out.println();
    }
}

// U.J.WEST
//11 Oak Ave
//Urbana IL 61801
//
//Ralph Baker
//1142 Maple Vane
//Mahomet IL 61853
//
//Tom Carlton
//865 Elm Est
//Champaign IL 61820
