package com.exercicios.estruturarepetitiva.para;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		float a, b, divisao;
		
		for(int i = 0; i < N; i++) {
			
			a = sc.nextFloat();
			b = sc.nextFloat();
			
			if (b == 0) {
				System.out.println("divisão impossível");
			} else {
				divisao = a/b;
				System.out.printf("%.1f%n", divisao);
			}
		}
		
		sc.close();
	}

}
