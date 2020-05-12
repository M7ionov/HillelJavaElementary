package com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Реализовать функцию по нахождению сумм цифр в числе (123->6, 202->4).");
        System.out.println("Please enter the number");
        int sum = 0, x = scanner.nextInt();;
        double fractional_part;
        do {
            fractional_part=x%10;
            sum=sum+(int)Math.round(fractional_part);
            System.out.println(sum);
            x=(int)(x/10);
        }
        while (x>0);
        System.out.println("Sum of digits in number = " + sum);
    }
}
