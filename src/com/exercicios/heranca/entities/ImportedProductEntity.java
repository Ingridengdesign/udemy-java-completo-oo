package com.exercicios.heranca.entities;

public class ImportedProductEntity extends ProductEntity {

	private Double customsFee;

	public ImportedProductEntity() {
		super();
	}

	public ImportedProductEntity(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) { 
		this.customsFee = customsFee;
	}
	 

	@Override
	public String priceTag() {
		return (super.priceTag() 
				+ " (Customs fee: $ " 
				+ String.format("%.2f", customsFee) + ")");
	}

	
	public Double totalPrice() {
		return getPrice()+ customsFee;
	}
	 
}
