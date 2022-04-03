package com.exercicios.estruturarepetitiva.enquanto;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		int combustivel = sc.nextInt();
		
		while (combustivel != 4) {
			if (combustivel == 1) {
				alcool++;
			} else if (combustivel == 2) {
				gasolina++;
			} else if (combustivel == 3) {
				diesel++;
			} else {
				System.out.println("Insira um código válido");
			}
			
			combustivel = sc.nextInt();
		}
		
		System.out.println("Muito obrigado");
		System.out.println("Álcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}

}
