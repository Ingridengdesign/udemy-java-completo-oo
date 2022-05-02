package com.exercicios.introducao.oo;

import java.util.Locale;
import java.util.Scanner;

import com.exercicios.introducao.oo.entites.Ex3StudentEntity;

public class Ex3Student {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Ex3StudentEntity student = new Ex3StudentEntity();
		
		student.name = sc.nextLine();
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();
		
		System.out.println("FINAL GRADE = " + String.format("%.2f", student.finalGrade())+ "\n" + student.result());
	
		
		sc.close();

	}

}
