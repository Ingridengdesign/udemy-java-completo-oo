package com.exercicios.heranca.entities;

import com.exercicios.heranca.entities.enums.Color;

public abstract class ShapeEntity {

	private Color color;
	
	public ShapeEntity() {
	}
	
	public ShapeEntity(Color color) {
		this.color = color;
	}
	

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract double area();
}
