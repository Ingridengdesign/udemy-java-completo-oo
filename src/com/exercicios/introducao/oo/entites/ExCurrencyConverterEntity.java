package com.exercicios.introducao.oo.entites;

public class ExCurrencyConverterEntity {
	
	public static double IOF = 0.06;
	
	public static double dollarToReais(double dollars, double dollarPrice) {
		return dollars*dollarPrice*(1.0+ IOF);
	}

}
