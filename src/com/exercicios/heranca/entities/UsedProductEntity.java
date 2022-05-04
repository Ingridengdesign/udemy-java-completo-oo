package com.exercicios.heranca.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProductEntity extends ProductEntity{
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date manufactureDate;
	
	public UsedProductEntity() {
		super();
	}

	public UsedProductEntity(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	
	public void setManufactureDate(Date manufactureDate) { 
		 this.manufactureDate =manufactureDate;
	}
	 
	
	@Override
	public String priceTag() {
		return(getName()+ " (used) $ " 
				+ String.format("%.2f", getPrice())
				+ " (Manufacture date: " 
				+ sdf.format(manufactureDate) +")");
	}
	

}
