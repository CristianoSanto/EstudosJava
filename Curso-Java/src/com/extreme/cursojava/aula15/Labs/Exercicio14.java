package com.extreme.cursojava.aula15.Labs;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2) /2;
		
		if (media >= 9.0 && media <= 10.0) {
			System.out.println("Você tirou nota 'A' e foi APROVADO" + media);
		}
		
		else if (media >= 7.5 && media < 9.0) {
			System.out.println("Você tirou nota 'B' e foi APROVADO" + media);
		}
		
		else if (media >= 6.0 && media < 7.5) {
			System.out.println("Você tirou nota 'C' e foi APROVADO" + media);
		}
		
		else if (media >= 4.0 && media < 6.0) {
			System.out.println("Você tirou nota 'D' e foi REPROVADO" + media);
		}		
				
		if (media >= 0 && media < 4) {
			System.out.println("Você tirou nota 'E' e foi REPROVADO" + media);
		}
		

	}

}
