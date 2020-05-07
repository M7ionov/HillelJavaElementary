package com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Программа, которая находит среднее арифметическое значение двух чисел.");

        System.out.println("Please input first number");
        double firstNumber = scanner.nextDouble();
        System.out.println("Your input " + firstNumber + " as a first number");

        System.out.println("Please input second number");
        double secondNumber = scanner.nextDouble();
        System.out.println("Input " + secondNumber + " as a second number");

        System.out.println("Result "+(firstNumber+secondNumber)/2);
    }
}
