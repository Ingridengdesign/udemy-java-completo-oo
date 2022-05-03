package com.exercicios.arrays;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [][] matriz = new int [n][n];
		int neg = 0;
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
				if(matriz[i][j] <0) {
					neg++;	
				}
			}
		}
		
		System.out.println("Main diagonal: ");
		for(int i=0; i<matriz.length; i++) {
			System.out.println(matriz[i][i] + " ");
		}
		System.out.println();
		
		System.out.println("Negative numbers: " + neg);
		sc.close();
	}

}
