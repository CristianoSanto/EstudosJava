package com.extreme.cursojava.aula15.Labs;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num1 = scan.nextInt();
		
		System.out.println("Digite outro número: ");
		int num2 = scan.nextInt();
		
		if (num1 > num2) {
			System.out.println("O número " + num1 + " é maior");	
		}
		
		else if (num2 > num1) {
			System.out.println("O número " + num2 + " é maior");	
		}
		

		
		

	}

}
