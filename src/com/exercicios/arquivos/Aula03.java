package com.exercicios.arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Aula03 {

	public static void main(String[] args) {
		String path = "C:\\Users\\ingrid.dias\\Documents\\udemy-java-completo-oo\\teste.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
						
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		

	}

}
