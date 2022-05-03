package com.exercicios;

import java.util.Locale;
import java.util.Scanner;

import com.exercicios.entities.ProdutosMediaEntity;

public class ProdutosMedia {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ProdutosMediaEntity[] vetor = new ProdutosMediaEntity[n];
		
		for(int i=0; i<vetor.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vetor[i] = new ProdutosMediaEntity(nome, preco);
			
		}
		
		double soma = 0.0;
		for(int i=0; i<vetor.length; i++) {
			soma += vetor[i].getPrice();
		}
		
		double media = soma/vetor.length;
		
		System.out.printf("MÉDIA DE PREÇOS = %.2f%n", media);
		
		sc.close();
	}

}
