package com.exercicios.interfaces.model.entites;

import com.exercicios.heranca.entities.enums.Color;

public abstract class AbstractShape implements ShapeInterface {
	
	private Color color;

	public AbstractShape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	

}
