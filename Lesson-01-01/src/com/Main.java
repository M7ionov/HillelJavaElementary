package com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input first number");
        double firstNumber = scanner.nextDouble();
        System.out.println("Your input " + firstNumber + " as a first number");

        System.out.println("Please input second number");
        double secondNumber = scanner.nextDouble();
        System.out.println("Input " + secondNumber + " as a second number");

        System.out.println("Your");
        System.out.println("    Sum is " + (firstNumber+secondNumber));
        System.out.println("    Difference is "+ (firstNumber-secondNumber));
        System.out.println("    Multiplication is " + (firstNumber*secondNumber));
        //if (secondNumber==0)
            System.out.println("    You cannot divide by zero");
        //else
            System.out.println("    Division is " + (firstNumber/secondNumber));

    }
}
