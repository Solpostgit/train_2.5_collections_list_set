package ru.skypro;

import java.util.Arrays;
import java.util.List;

public class ArrayListExample
{
public static void main(String[] args) {
        Integer[] numbersArray = {1, 2, 3};
        List<Integer> numbersList = List.of(1, 2, 3);
        System.out.println(Arrays.toString(numbersArray));

        System.out.println(Arrays.toString(numbersArray));
        Person[] personArray = new Person[3];
        personArray[0] = new Person("Ivan", "Petrov", 35);
        personArray[1] = new Person("Ivan1", "Petrov1", 37);
        personArray[2] = new Person("Ivan2", "Petrov2", 32);

        System.out.println(Arrays.toString(personArray));
}
}
