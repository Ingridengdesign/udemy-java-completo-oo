package com.exercicios.interfaces.model.entites;

import com.exercicios.heranca.entities.enums.Color;

public class CircleRefactor  extends AbstractShape{

	private Double radius;
	
	public CircleRefactor(Color color, Double radius) {
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
