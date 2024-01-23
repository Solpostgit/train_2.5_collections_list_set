package ru.skypro;

import java.util.*;

public class ArrayListExample
{
public static void main(String[] args) {
        Integer[] numbersArray = {1, 2, 3};
        List<Integer> numbersList = List.of(5, 6, 7);

        System.out.println(Arrays.toString(numbersArray));

        Person[] personArray = new Person[3];

        personArray[0] = new Person("Ivan", "Petrov", 35);
        personArray[1] = new Person("Ivan1", "Petrov1", 37);
        personArray[2] = new Person("Ivan2", "Petrov2", 32);

        System.out.println(Arrays.toString(personArray));

        String abc = "20";
        int b = Integer.parseInt(abc); // метод перевода текста в число
        System.out.println(b);

        Integer i1 = numbersList.get(0);
        System.out.println(i1);

        //Итерация списка nums
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        for (int i = 0; i < nums.size(); i++) {
                System.out.println(nums.get(i));
        }

        //Итерация множества циклом foreach
        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("pineapple");
        for (String fruit: fruits) {
                System.out.println(fruit);
        }

        ArrayList <String> deliveryCities = new ArrayList<>();

        deliveryCities.add("Chicago");
        deliveryCities.add("New York");
        deliveryCities.add("Toronto");
        deliveryCities.add(0,"Paris");

        System.out.println("deliveryCities.size = " + deliveryCities.size()); //размер списка
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

        List<Integer> numbersCar = new ArrayList<>(List.of(1, 3, 5, 6, 7, 8, 9));
        System.out.println(numbersCar.get(0));
        System.out.println(numbersCar.size());
        numbersCar.set(6, 9);
        numbersCar.add(7, 99);
        numbersCar.add(8, 100);
        numbersCar.remove(8);
        if (numbersCar.contains(100)) {
                System.out.println("имеется 99");
        } else System.out.println("отсутствует");

        System.out.println(numbersCar.toString());

        List<String> wordsFruits = new ArrayList<>();
        wordsFruits.add(0,"onion");
        wordsFruits.add(1,"potato");
        wordsFruits.add(2,"carrot");
        wordsFruits.add(3,"dill");
        System.out.println(wordsFruits.size());
        wordsFruits.set(3, "parsley");
        System.out.println(wordsFruits.get(2));
        System.out.println(wordsFruits.toString());

        Set<String> wordsVegetables = new HashSet<>();
        wordsVegetables.add("onion");
        wordsVegetables.add("potato");
        wordsVegetables.add("carrot");
        wordsVegetables.add("pumpkin");
        for (String wordVeg:wordsVegetables
             ) {
                System.out.println(wordVeg);
        }
        if (wordsVegetables.contains("pumpkin")) {
                System.out.println("good");
        }
        System.out.println(wordsVegetables);

        //   numbersList.toString();

     //   List<Person>personList = new ArrayList<>();

    //    personList.add(0, "Ivan", "Petrov", 35);

}
}
