package com.exercicios.estruturacondicional;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		int A, B;
		
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		if(A % B == 0 || B % A == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao Sao Multiplos");
		}
		
		sc.close();
	}

}
