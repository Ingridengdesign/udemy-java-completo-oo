package com.exercicios.estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int peca1, numeroDePecas1, peca2, numeroDePecas2;
		double valor1, valor2, total1, total2, total;
		
		Scanner sc = new Scanner(System.in);
		
		peca1 = sc.nextInt();
		numeroDePecas1 = sc.nextInt();
		valor1 = sc.nextDouble();
		
		total1 = numeroDePecas1 * valor1;
		
		peca2 = sc.nextInt();
		numeroDePecas2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		total2 = numeroDePecas2 * valor2;
		
		total = total1 + total2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total );
		
		sc.close();
		
	}

}
