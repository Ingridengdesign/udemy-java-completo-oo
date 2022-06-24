package com.exercicios.lambda;

import java.util.ArrayList;
import java.util.List;

import com.exercicios.lambda.entites.Product;

public class IntroLambda {
	
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		

		//arrow function ou função anônima

		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		for(Product p : list) {
			System.out.println(p);
		}
	}

}
