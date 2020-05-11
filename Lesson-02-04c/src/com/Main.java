package com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Вывести на консоль графику (ширину и высоту задает пользователь) вида:");
        System.out.println("в. в шахматном порядке");

        System.out.println("Please enter the width of the rectangle");
        int x = scanner.nextInt();
        System.out.println("Your input " + x + " as a width");

        System.out.println("Please enter the height of the rectangle");
        int y = scanner.nextInt();
        System.out.println("Input " + y + " as a height");

        for (int j = 1 ; j<=y ; j++){
            System.out.println();
            for (int i = 1 ; i<=x ; i++) {
                if ((i+j)%2==0)
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
        }
    }
}

