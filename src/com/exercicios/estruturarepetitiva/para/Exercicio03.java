package com.exercicios.estruturarepetitiva.para;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		float a, b, c, mediaP;
		
		
		for(int i = 0; i < N; i++) {
			
			a = sc.nextFloat();
			b = sc.nextFloat();
			c = sc.nextFloat();
			
			mediaP = (a*2 + b*3 + c*5)/10;
			
			System.out.printf("%.1f%n", mediaP);
		}
		
		sc.close();
	}

}
