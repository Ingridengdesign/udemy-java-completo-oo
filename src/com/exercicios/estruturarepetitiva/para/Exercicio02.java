package com.exercicios.estruturarepetitiva.para;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		int in = 0;
		int out = 0;
		
		for(int i = 0; i < numero; i++) {
			int n = sc.nextInt();
			if(n >= 10 && n <= 20) {
				in++;
			} else {
				out++;
			}
		}
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
	}

}
