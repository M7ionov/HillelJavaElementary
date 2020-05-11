package com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести число, определить простое ли оно.");

        System.out.println("Please enter the number");
        int x = scanner.nextInt();
        for (int i=2; i<x ; i++)
            if (x%i==0)
                System.out.println("You entered the number " + x + " - it is divided by " + i);
            else if (i==(x-1))
                System.out.println("You entered the number " + x + " - it is simple");
    }
}
