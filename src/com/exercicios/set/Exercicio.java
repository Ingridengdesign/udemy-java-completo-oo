package com.exercicios.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> A = new HashSet<>();
		Set<Integer> B = new HashSet<>();
		Set<Integer> C = new HashSet<>();
		
		System.out.println("Quantos estudantes para o curso A? ");
		int alunos = sc.nextInt();
		for (int i = 0; i < alunos; i++) {
			int n = sc.nextInt();
			A.add(n);
		}
		
		System.out.println("Quantos estudantes para o curso B? ");
		alunos = sc.nextInt();
		for (int i = 0; i < alunos; i++) {
			int n = sc.nextInt();
			B.add(n);
		}
		
		System.out.println("Quantos estudantes para o curso C? ");
		alunos = sc.nextInt();
		for (int i = 0; i < alunos; i++) {
			int n = sc.nextInt();
			C.add(n);
		}
		
		Set<Integer> total = new HashSet<>(A);
		total.addAll(B);
		total.addAll(C);

		System.out.println("Total de alunos: " + total.size());
		
		sc.close();

	}

}
