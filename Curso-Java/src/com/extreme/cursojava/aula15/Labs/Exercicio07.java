package com.extreme.cursojava.aula15.Labs;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int num1 = scan.nextInt();
		
		System.out.println("Digite outro número");
		int num2 = scan.nextInt();
		
		System.out.println("Digite mais um número");
		int num3 = scan.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("O número " + num1 + " é maior");
		}
		

		else if (num2 > num1 && num2 > num3) {
			System.out.println("O número " + num2 + " é maior");
		}
		

		if (num3 > num2 && num3 > num1) {
			System.out.println("O número " + num3 + " é maior");
		}	

		
		
		
		
		
		
		if (num1 < num2 && num1 < num3) {
			System.out.println("O número " + num1 + " é menor");
		}
		

		else if (num2 < num1 && num2 < num3) {
			System.out.println("O número " + num2 + " é menor");
		}
		

		if (num3 < num2 && num3 < num1) {
			System.out.println("O número " + num3 + " é menor");
		}	
		
		

		

	}

}
