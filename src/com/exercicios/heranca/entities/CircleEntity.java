package com.exercicios.heranca.entities;

import com.exercicios.heranca.entities.enums.Color;

public class CircleEntity extends ShapeEntity {

	private Double radius;
	
	public CircleEntity() {
		super();
	}
	
	public CircleEntity(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI*Math.pow(radius, 2);
	}

}
