package com.exercicios.estruturarepetitiva.enquanto;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		short senha = sc.nextShort();
		
		while(senha != 2002) {
			System.out.println("Senha Inválida");
			senha = sc.nextShort();
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();
	}

}
