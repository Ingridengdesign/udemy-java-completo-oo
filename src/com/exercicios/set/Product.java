package com.exercicios.set;

import java.util.Set;
import java.util.TreeSet;

import com.exercicios.set.entities.ProductEntity;

public class Product {
	public static void main(String[] args) {
		
		//Set<ProductEntity> set = new HashSet<>(); retorna falso sem a implementacao na classe ProductEntity
		
		Set<ProductEntity> set = new TreeSet<>();
		set.add(new ProductEntity("TV", 900.0));
		set.add(new ProductEntity("Notebook", 1200.0));
		set.add(new ProductEntity("Tablet", 400.0));
		
		//ProductEntity prod = new ProductEntity("Notebook", 1200.0);
		
		//System.out.println(set.contains(prod));
		
		for(ProductEntity p : set) {
			System.out.println(p);
		}
	}
}
