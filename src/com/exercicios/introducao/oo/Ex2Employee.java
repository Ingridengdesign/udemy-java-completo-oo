package com.exercicios.introducao.oo;

import java.util.Locale;
import java.util.Scanner;

import com.exercicios.introducao.oo.entites.Ex2EmployeeEntity;

public class Ex2Employee {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Ex2EmployeeEntity employee = new Ex2EmployeeEntity();
		
		System.out.println("Name: ");
		employee.name = sc.nextLine();
		
		System.out.println("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.println("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println("Employee: " + employee.name + ", $" + employee.NetSalary());
		
		System.out.println("Which percentage to increase salary? ");
		employee.increase = sc.nextDouble();
		
		System.out.println("Updated data: " + employee.name + ", $ " + String.format("%.2f", employee.IncreaseSalary()));

		sc.close();
	}

}
