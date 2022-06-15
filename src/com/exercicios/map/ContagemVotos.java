package com.exercicios.map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ContagemVotos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Map<String, Integer> votos = new LinkedHashMap<>();

		System.out.print("Escreva o caminho completo para o arquivo: ");
		String arq = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(arq))) {

			String linha = br.readLine();
			while (linha != null) {

				String[] fields = linha.split(",");
				String nome = fields[0];
				int contagem = Integer.parseInt(fields[1]);

				if (votos.containsKey(nome)) {
					int votosCont = votos.get(nome);
					votos.put(nome, contagem + votosCont);
				} else {
					votos.put(nome, contagem);
				}

				linha = br.readLine();
			}

			for (String x : votos.keySet()) {
				System.out.println(x + ": " + votos.get(x));
			}

		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

		sc.close();
	}

}
