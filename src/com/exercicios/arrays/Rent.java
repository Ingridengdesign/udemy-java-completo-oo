package com.exercicios.arrays;

import java.util.Scanner;

import com.exercicios.arrays.entites.RentEntity;

public class Rent {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		RentEntity [] vect = new RentEntity[10];
		
		System.out.println("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room] = new RentEntity(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		for(int i=0; i<10; i++) {
			if(vect[i] != null) {
				System.out.println(i + ":" + vect[i]);
			}
		}
		
		sc.close();
	}

}
