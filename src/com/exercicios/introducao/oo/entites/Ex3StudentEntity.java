package com.exercicios.introducao.oo.entites;

public class Ex3StudentEntity {

	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	public double missed;
	
	public double finalGrade() {
		return grade1+grade2+grade3;
	}
	
	public String result() {
		if (finalGrade() >= 60){
			return ("PASS");
		}else {
			missed = 60 - finalGrade();
			
			return("FAILED" +"\n" + "MISSING "+ String.format("%.2f", missed) + " POINTS");
		}
 	}
}
