package com.extreme.cursojava.aula15.Labs;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num = scan.nextInt();
		
		
		
		if (num % 2 == 0){
			System.out.println("é par");
		}
		
		else {
			System.out.println("é ímpar");
		}
		
		


	}

}
