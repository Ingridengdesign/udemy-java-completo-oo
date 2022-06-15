package com.exercicios.map;

import java.util.HashMap;
import java.util.Map;

import com.exercicios.map.entity.ProductEntity;

public class Exemplo2 {

	public static void main(String[] args) {

		Map<ProductEntity, Double> stock = new HashMap<>();
		
		ProductEntity p1 = new ProductEntity("Tv", 900.0);
		ProductEntity p2 = new ProductEntity("Notebook", 1200.0);
		ProductEntity p3 = new ProductEntity("Tablet", 400.0);
		
		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);
		
		ProductEntity ps = new ProductEntity("Tv", 900.0);
		
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));

	}

}
