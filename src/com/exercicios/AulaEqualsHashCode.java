package com.exercicios;

import com.exercicios.entities.ClientEHC;

public class AulaEqualsHashCode {

	public static void main(String[] args) {

		ClientEHC c1 = new ClientEHC("Maria", "maria@gmail.com");
		ClientEHC c2 = new ClientEHC("Maria", "maria@gmail.com");

		String s1 = "Test";
		String s2 = "Test";
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2);//da falso por estarem alocados em espaços diferentes de memória
		System.out.println(s1 == s2);
		}
}
