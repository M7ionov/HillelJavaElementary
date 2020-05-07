package com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input first number");
        double firstNumber = 0;
        if (scanner.hasNextDouble())
            firstNumber = scanner.nextDouble();
        else {
            while (!scanner.hasNextDouble()) {
                System.out.println("Please check the entered number and re-enter ");
                scanner.next();
                firstNumber = scanner.nextDouble();
            }
        }
        System.out.println("Your input " + firstNumber + " as a first number");

        System.out.println("Please input second number");
        double secondNumber = scanner.nextDouble();
        System.out.println("Input " + secondNumber + " as a second number");

        System.out.println("Please input operation - + * /");
        char operation = scanner.next().charAt(0);
        switch (operation) {
            case '+':
                System.out.println("Your sum is " + (firstNumber + secondNumber));
                break;
            case '-':
                System.out.println("Your difference is " + (firstNumber - secondNumber));
                break;
            case '*':
                System.out.println("Your multiplication is " + (firstNumber * secondNumber));
                break;
            case '/':
                System.out.println("Your division is " + (firstNumber / secondNumber));
                break;
        }
    }
}
