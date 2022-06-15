package com.exercicios.generics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.exercicios.generics.entities.Product;
import com.exercicios.generics.service.CalculationService;

public class Consultancy {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		String path = "C:\\Users\\ingrid.dias\\Documents\\udemy-java-completo-oo\\products.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			Product x = CalculationService.max(list);
			System.out.println("Most expensive:");
			System.out.println(x);
		} catch (IOException e) {
			System.out.println("Error:" + e.getMessage());
		}

	}

}
