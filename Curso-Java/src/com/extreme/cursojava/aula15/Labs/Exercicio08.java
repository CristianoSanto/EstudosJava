package com.extreme.cursojava.aula15.Labs;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Digite o valor do primeiro produto: ");
		double prod1 = scan.nextDouble();
		

		System.out.println("Digite o valor do segundo produto: ");
		double prod2 = scan.nextDouble();
		

		System.out.println("Digite o valor do terceiro produto: ");
		double prod3 = scan.nextDouble();
		
		//______________________________________________________
		//------------------------------------------------------
		
		if (prod1 <= prod2 && prod1 <= prod3) {
			System.out.println("O primeiro produto custa " + prod1 + " e é o mais barato");
		}
		

		else if (prod2 <= prod1 && prod2 <= prod3) {
			System.out.println("O segundo produto custa " + prod2 + " e é o mais barato");
		}
		

		if (prod3 <= prod2 && prod3 <= prod1) {
			System.out.println("O terceiro produto custa " + prod3 + " e é o mais barato");
		}
		
		
		
		
		
		
		
		
		
		


	}

}
