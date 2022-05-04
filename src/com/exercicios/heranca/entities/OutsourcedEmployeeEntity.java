package com.exercicios.heranca.entities;

public class OutsourcedEmployeeEntity extends EmployeeEntity {

	private Double addtionalCharge;
	
	public OutsourcedEmployeeEntity() {
		super();		
	}

	public OutsourcedEmployeeEntity(String name, Integer hours, Double valuePerHour, Double addtionalCharge) {
		super(name, hours, valuePerHour);
		this.addtionalCharge = addtionalCharge;
	}

	public Double getAddtionalCharge() {
		return addtionalCharge;
	}

	public void setAddtionalCharge(Double addtionalCharge) {
		this.addtionalCharge = addtionalCharge;
	}
	
	@Override
	public double payment() {
		return super.payment() + addtionalCharge * 1.1;
	}
	
}
