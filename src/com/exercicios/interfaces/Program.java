package com.exercicios.interfaces;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import com.exercicios.interfaces.model.entites.ContractEntity;
import com.exercicios.interfaces.model.entites.InstallmentEntity;
import com.exercicios.interfaces.model.services.ContractService;
import com.exercicios.interfaces.model.services.PaypalService;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter contract data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.next());
		System.out.print("Contract value: ");
		double totalValue = sc.nextDouble();
		
		ContractEntity contract = new ContractEntity(number, date, totalValue);
		
		System.out.print("Enter number of installments: ");
		int n = sc.nextInt();
		
		ContractService contractService = new ContractService(new PaypalService());
		
		contractService.processContract(contract, n);
		
		System.out.println("Installments:");
		for (InstallmentEntity x : contract.getInstallments()) {
			System.out.println(x);
		}
		
		sc.close();
	}

}
