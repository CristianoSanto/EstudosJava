package com.extreme.cursojava.aula13.Labs;

import java.util.Scanner;


public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		
		System.out.println("Digite o tamanho do arquivo em MB:");
		double tamanhoArquivo = scan.nextDouble();
		
		System.out.println("Entre com a velocidade da internet:");
		double velocidadeInternet = scan.nextDouble();
		
		double tempo = tamanhoArquivo / velocidadeInternet;
		
		
		System.out.println("Tempo de download: " + tempo);
	}

}
