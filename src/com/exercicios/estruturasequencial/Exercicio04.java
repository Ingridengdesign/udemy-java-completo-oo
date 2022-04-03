package com.exercicios.estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int worker, hours;
		float paymentPerHour, salary;
		
		Scanner sc = new Scanner(System.in);
		
		worker = sc.nextInt();
		hours = sc.nextInt();
		
		paymentPerHour = sc.nextFloat();
		
		salary = paymentPerHour * hours;
		
		System.out.println("NUMBER = " + worker);
		System.out.printf("SALARY = %.2f%n" , salary);
		
		sc.close();

	}

}
