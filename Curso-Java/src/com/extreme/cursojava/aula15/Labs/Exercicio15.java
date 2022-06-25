package com.extreme.cursojava.aula15.Labs;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o lado 1: ");
		int lado1 = scan.nextInt();
		
		System.out.println("Entre com o lado 2: ");
		int lado2 = scan.nextInt();

		
		System.out.println("Entre com o lado 3: ");
		int lado3 = scan.nextInt();
		
		if (((lado1 + lado2) > lado3) ||
				((lado1 + lado3) > lado2) ||
				((lado2 + lado3) > lado1)) {
			
		}
		else {
			System.out.println("Não forma um triângulo");
		}
		
		if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
			System.out.println("Triângulo Equilátero");
		}
		
		else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
			System.out.println("Triângulo Escaleno");
		}
		
		else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			System.out.println("Triângulo Isóceles");
		
		


		}
	}

}
