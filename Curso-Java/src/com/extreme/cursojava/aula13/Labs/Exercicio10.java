package com.extreme.cursojava.aula13.Labs;

import java.util.Scanner;


public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		
		System.out.println("Digite a temperatura em graus celcius: ");
		double cel = scan.nextDouble();
		
		double far = far = (cel * 1.8) + 32;
		
		System.out.println("A temperatura " + cel + " Celsius é igual a " + far + " Farenheit");

		
	}

}
