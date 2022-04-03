package com.exercicios.estruturacondicional;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		numero = sc.nextInt();
		
		if (numero >=0) {
			System.out.println("NAO NEGATIVO");
		} else {
			System.out.println("NEGATIVO");
		}
		
		sc.close();

	}

}
