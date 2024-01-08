package ru.skypro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample
{
public static void main(String[] args) {
        Integer[] numbersArray = {1, 2, 3};
        List<Integer> numbersList = List.of(1, 2, 3);

        System.out.println(Arrays.toString(numbersArray));

        Person[] personArray = new Person[3];

        personArray[0] = new Person("Ivan", "Petrov", 35);
        personArray[1] = new Person("Ivan1", "Petrov1", 37);
        personArray[2] = new Person("Ivan2", "Petrov2", 32);

        System.out.println(Arrays.toString(personArray));

        String abc = "20";
        int b = Integer.parseInt(abc); // метод перевода текста в число
        System.out.println(b);

        Integer i = numbersList.get(0);
        System.out.println(i);

        ArrayList <String> deliveryCities = new ArrayList<>();

        deliveryCities.add("Chicago");
        deliveryCities.add("New York");
        deliveryCities.add("Toronto");
        deliveryCities.add(0,"Paris");

        System.out.println(deliveryCities.size()); //размер списка
        System.out.println(deliveryCities);
        System.out.println(deliveryCities.get(3));
        System.out.println(deliveryCities.indexOf("Chicago"));
        System.out.println(deliveryCities.indexOf("Dallas")); //отсутствует -1
        System.out.println(deliveryCities.contains("Toronto"));
        deliveryCities.add("Vienna");
        deliveryCities.add("Vienna2");

        deliveryCities.set(2, "Los Angeles");

        System.out.println(deliveryCities.size());
        deliveryCities.remove("Vienna");
        deliveryCities.remove(4);

        System.out.println(deliveryCities);



        //   numbersList.toString();

     //   List<Person>personList = new ArrayList<>();

    //    personList.add(0, "Ivan", "Petrov", 35);

}
}
