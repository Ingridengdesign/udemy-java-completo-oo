package com.exercicios.interfaces;

import com.exercicios.heranca.entities.enums.Color;
import com.exercicios.interfaces.model.entites.AbstractShape;
import com.exercicios.interfaces.model.entites.CircleRefactor;
import com.exercicios.interfaces.model.entites.RectangleRefactor;

public class Shape {

	public static void main(String[] args) {
		AbstractShape s1 = new CircleRefactor(Color.BLACK, 2.0);
		AbstractShape s2 = new RectangleRefactor(Color.WHITE, 3.0, 4.0);
		
		System.out.println("Circle color: " + s1.getColor());
		System.out.println("Circle area: " + String.format("%.3f", s1.area()));
		System.out.println("Rectangle color: " + s2.getColor());
		System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));

	}

}
