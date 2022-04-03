package com.exercicios.estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		Locale.setDefault(Locale.US);
		
		int codigo, qtd;
		double total = 0;
		
		codigo = sc.nextInt();
		qtd = sc.nextInt();
		
		if (codigo == 1) {
			total = qtd * 4.00;
		} else if (codigo == 2){
			total = qtd * 4.50;
		} else if (codigo == 3) {
			total = qtd * 5.00;
		} else if (codigo == 4) {
			total = qtd * 2.00;
		} else if (codigo == 5) {
			total = qtd * 1.50;
		}

		
		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();
	}

}
