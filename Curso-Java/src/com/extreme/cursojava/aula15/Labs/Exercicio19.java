package com.extreme.cursojava.aula15.Labs;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num1 = scan.nextInt();
		
		System.out.println("Digite outro número: ");
		int num2 = scan.nextInt();
		
		System.out.println("Qual operação você quer realizar: \n 1 -> Adição\n 2 -> Subtração\n 3 -> Multiplicação\n 4 -> Divisão");
		
		String operacao = scan.next();
		
		int resultado =0;
		boolean valida = true;
		
		switch (operacao) {
		case "1": resultado = num1 + num2; break;
		case "2": resultado = num1 - num2; break;
		case "3": resultado = num1 * num2; break;
		case "4": resultado = num1 / num2; break;
		default: System.out.println("Operação inválida"); valida = false; 
		
		}
		
		if (valida) {
			
			System.out.println("Resultado: " + resultado);
			
			if (resultado >= 0) {
				System.out.println("resultado positivo");
			}
			else {
				System.out.println("resultado negativo");
			}
			if (resultado % 2 == 0) {
				System.out.println("resultado par");
			}
			else {
				System.out.println("resultado impar");
			}
		}
		
		
		
		
		
		
		
		
		


	}

}
