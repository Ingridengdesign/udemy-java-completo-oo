package com.exercicios.introducao.oo;

import java.util.Locale;
import java.util.Scanner;

import com.exercicios.introducao.oo.entites.ExCurrencyConverterEntity;

public class ExCurrencyConverter {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		double dollars = sc.nextDouble();
		double result = ExCurrencyConverterEntity.dollarToReais(dollars, dollarPrice);
		System.out.println("Amount to be paid in reais = " + String.format("%.2f", result));
		
		sc.close();
	}

}
