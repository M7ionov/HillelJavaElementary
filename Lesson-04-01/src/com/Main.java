package com;

import java.util.Arrays;

public class Main {

    //High cohesion - Высокая сплоченность

    public static void main(String[] args) {
        Student ivanov = new Student("Ivanov");
        Student petrov = new Student("Petrov", 10);
        //ivanov.surname = "Ivanov";
        //ivanov.marks = new int[32];
        System.out.println(ivanov.surname);
        System.out.println(Arrays.toString(ivanov.marks));
        System.out.println(petrov.surname);
        System.out.println(Arrays.toString(petrov.marks));
    }
}
