package com.extreme.cursojava.aula15.Labs;

import java.util.Scanner;

public class Exerccio02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num = scan.nextInt();
		
		if (num >= 0) {
			
			System.out.println("O número informado é positivo");	
		}
		else {
			System.out.println("O número informado é negativo");	

		}
	}

}
