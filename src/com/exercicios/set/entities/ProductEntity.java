package com.exercicios.set.entities;

import java.util.Objects;

public class ProductEntity  implements Comparable<ProductEntity>{
	private String name;
	private Double price;

	public ProductEntity(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductEntity other = (ProductEntity) obj;
		return Objects.equals(name, other.name) && Objects.equals(price, other.price);
	}

	@Override
	public String toString() {
		return "ProductEntity [name=" + name + ", price=" + price + "]";
	}

	@Override
	public int compareTo(ProductEntity other) {
		// TODO Auto-generated method stub
		return name.toUpperCase().compareTo(other.getName().toUpperCase());
	}

	
}
