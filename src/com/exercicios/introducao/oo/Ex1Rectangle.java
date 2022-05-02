package com.exercicios.introducao.oo;

import java.util.Locale;
import java.util.Scanner;

import com.exercicios.introducao.oo.entites.Ex1RectangleEntity;

public class Ex1Rectangle {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Ex1RectangleEntity rectangle = new Ex1RectangleEntity(); 
		
		System.out.println("Enter rectangle width and height: ");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.println("AREA = " + String.format("%.2f", rectangle.area()));
		System.out.println("PERIMETER = " + String.format("%.2f", rectangle.perimeter()));
		System.out.println("DIAGONAL = " + String.format("%.2f", rectangle.diagonal()));
		
		
		sc.close();
	}
	

}
