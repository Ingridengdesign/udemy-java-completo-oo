package com.exercicios.estruturasequencial;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
	
		int num1, num2, soma;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um n�mero inteiro:");
		num1 = sc.nextInt();
		
		System.out.println("Insira outro n�mero:");
		num2 = sc.nextInt();
		
		
		soma = num1 + num2;
		
		System.out.println("SOMA: " + soma);
		sc.close();
	}

}
