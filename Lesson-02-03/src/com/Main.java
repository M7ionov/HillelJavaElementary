package com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Программа, которая находит среднее арифметическое значение произвольного количества чисел.");

        System.out.println("Please enter the number of items");
        int itemNumber = scanner.nextInt();
        double[] array1 = new double[itemNumber];
        double sum = 0;
        for (int i =0 ; i<itemNumber ; i++) {
            System.out.println("Please input " + (i+1) + " item");
            array1[i] = scanner.nextDouble();
            System.out.println("Your input " + array1[i] + " as a " + (i+1) + " number");
            sum = sum + array1[i];
        }

        System.out.println("Result "+(sum/(itemNumber)));
    }
}
