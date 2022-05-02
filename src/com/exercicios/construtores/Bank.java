package com.exercicios.construtores;

import java.util.Locale;
import java.util.Scanner;

import com.exercicios.construtores.entities.BankEntity;

public class Bank {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		BankEntity client;
		
		System.out.println("Enter account number: ");
		int account = sc.nextInt();
		
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.println("Is there an initial deposit (y/n)? ");
		char option = sc.next().charAt(0);
		
		if (option == 'y') {
			System.out.print("Enter initial deposit value: ");
			double firstDeposit = sc.nextDouble();
			client = new BankEntity(account, name, firstDeposit);
		}else {
			client = new BankEntity(account, name);
		}
			
		
		
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(client);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		client.deposit(depositValue);
		
		System.out.println();
		System.out.println("Updated account data: ");
		System.out.println(client);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		client.withdraw(withdrawValue);
		
		System.out.println();
		System.out.println("Updated account data: ");
		System.out.println(client);
		
		sc.close();
		
	}

}
