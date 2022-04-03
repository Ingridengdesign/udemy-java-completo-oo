package com.exercicios.estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		double salario, impostoDeRenda;
		salario = sc.nextDouble();

		if (salario <= 2000) {
			System.out.println("Isento");
		} else if (salario > 2000 && salario <= 3000){
			impostoDeRenda = (salario - 2000) * 0.08;
			System.out.printf("R$ %.2f%n", impostoDeRenda);
		} else if (salario > 3000 && salario <= 4500) {
			impostoDeRenda = (salario - 3000) * 0.18 + 1000 * 0.08 ;
			System.out.printf("R$ %.2f%n", impostoDeRenda);
		} else if (salario > 4500) {
			impostoDeRenda = (salario - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08 ;
			System.out.printf("R$ %.2f%n", impostoDeRenda);
		}
		
		sc.close();
	}

}
