package com.exercicios.enumeracoes.entites;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.exercicios.enumeracoes.entites.enums.WorkerLevel;

public class WorkerEntity {
	
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	private Department departament;
	private List<HourContract> contracts = new ArrayList<>();
	
	public WorkerEntity() {
		
	}

	public WorkerEntity(String name, WorkerLevel level, Double baseSalary, Department departament) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departament = departament;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartament() {
		return departament;
	}

	public void setDepartament(Department departament) {
		this.departament = departament;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}
	
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	public double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		for (HourContract c : contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month= 1 + cal.get(Calendar.MONTH);
			if(year == c_year && month == c_month) {
				sum+= c.totalValue();
			}
		}
		return sum;
	}

	@Override
	public String toString() {
		return "WorkerEntity [name=" + name + ", level=" + level + ", baseSalary=" + baseSalary + ", departament="
				+ departament + ", contracts=" + contracts + "]";
	}
	
	
	

}