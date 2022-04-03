package com.exercicios.estruturarepetitiva.enquanto;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		float x,y;
		x = sc.nextFloat();
		y = sc.nextFloat();
		
		while(x != 0 || y != 0) {
			
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			} else if (x < 0 && y > 0){
				System.out.println("segundo");
			} else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			} else if (x > 0 && y < 0) {
				System.out.println("quarto");
			}
			
			x = sc.nextFloat();
			y = sc.nextFloat();
			
		}
		
		sc.close();

	}

}
