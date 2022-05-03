package com.exercicios.enumeracoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import com.exercicios.enumeracoes.entites.Department;
import com.exercicios.enumeracoes.entites.HourContract;
import com.exercicios.enumeracoes.entites.WorkerEntity;
import com.exercicios.enumeracoes.entites.enums.WorkerLevel;

public class Worker {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");	
		
		System.out.println("Enter department's name: ");
		String departamentName = sc.nextLine();
		System.out.println("Enter worker data: ");
		System.out.println("Name: ");
		String workerName = sc.nextLine();
		
		System.out.println("Level: ");
		String workerLevel = sc.nextLine();
		
		System.out.println("Base Salary");
		double baseSalary = sc.nextDouble();
		
		WorkerEntity worker = new WorkerEntity(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departamentName));
		
		System.out.println("How many contracts to this worker?");
		int cont = sc.nextInt();
		
		for(int i=1; i<=cont; i++ ) {
			System.out.println("Enter contract #" + i +" data:");
			System.out.print("Date(DD/MM/YYYY)");
			Date contractDate = sdf.parse(sc.next());
			System.out.println("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0,2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Departament: " + worker.getDepartament());
		System.out.println("Income for" + monthAndYear + ":" + String.format("%.2f", worker.income(year, month)));
		
		sc.close();
	}

}
