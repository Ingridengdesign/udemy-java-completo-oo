package com.exercicios.estruturasequencial;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		int A, B, C, D, DIFERENCA;
		
		Scanner sc = new Scanner(System.in);
	
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		DIFERENCA = (A*B - C*D);
		
		System.out.println("DIFEREN�A = " + DIFERENCA);
		
		sc.close();
	}

}
