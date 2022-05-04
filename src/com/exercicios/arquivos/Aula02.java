package com.exercicios.arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Aula02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path = "C:\\Users\\ingrid.dias\\Documents\\udemy-java-completo-oo\\teste.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			try {
				if(br != null) {
					br.close();
				}
				if(fr != null) {
					fr.close();
				}
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
