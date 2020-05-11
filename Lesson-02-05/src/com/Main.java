package com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести число, определить четное или нет.");

        System.out.println("Please enter the number");
        int x = scanner.nextInt();
        if (x%2==0)
            System.out.print("You entered the number " + x + " - it is even");
            else
                System.out.print("You entered the number " + x + " - it is odd");
    }
}