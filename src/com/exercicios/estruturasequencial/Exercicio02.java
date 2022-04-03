package com.exercicios.estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double area, raio;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Insira o raio:");
		
		raio = sc.nextDouble();
		
		area = raio*raio*Math.PI;
		
		
		System.out.printf("A= %.4f%n", area);
		
		sc.close();
		

	}

}
