package com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Программа, которая предлагает пользователю ввести сумму денежного вклада в гривнах, процент годовых, которые выплачивает банк, длительность вклада (лет). ");
	System.out.println("Вывести накопленную сумму денег за каждый год и начисленные проценты.");
	Scanner scanner = new Scanner(System.in);

	System.out.println("Please input your deposit");
	double deposit = scanner.nextDouble();
	System.out.println("Please enter the annual percentage");
	int percent = scanner.nextInt();
	System.out.println("Please enter the duration of the deposit (years)");
	int duration = scanner.nextInt();
    double sum = deposit;
	for (int i = 0 ; i<duration ; i++){
	    deposit = sum;
	    sum = sum + sum*percent/100;
	    System.out.println("Per " + (i+1) + " year ammount = " + sum + " including interest " + (deposit*percent)/100);
    }

    }
}
