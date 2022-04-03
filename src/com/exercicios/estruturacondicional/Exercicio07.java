package com.exercicios.estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		float x,y;
		x = sc.nextFloat();
		y = sc.nextFloat();

		if (x > 0 && y > 0) {
			System.out.println("Q1");
		} else if (x < 0 && y > 0){
			System.out.println("Q2");
		} else if (x < 0 && y < 0) {
			System.out.println("Q3");
		} else if (x > 0 && y < 0) {
			System.out.println("Q4");
		} else if (x == 0 && y != 0){
			System.out.println("Eixo x");
		} else if (x != 0 && y == 0) {
			System.out.println("Eixo y");
		} else {
			System.out.println("Origem");
		}
		sc.close();
	}

}
