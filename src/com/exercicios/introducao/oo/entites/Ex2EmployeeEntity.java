package com.exercicios.introducao.oo.entites;

public class Ex2EmployeeEntity {
	
	public String name;
	public double grossSalary;
	public double tax;
	public double increase;
	
	public double NetSalary() {
		return grossSalary-tax;
	}
	
	public double IncreaseSalary() {
		return grossSalary*(increase/100)+NetSalary();
	}

}
