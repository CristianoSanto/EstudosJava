package com.extreme.cursojava.aula13.Labs;

import java.util.Scanner;


public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a temperatura em Faenheit: ");
		double far = scan.nextDouble();
		
		double cel = (5 *(far-32) /9);
		
		System.out.println("A temperaura " + far + " Farenheits é igual a " + cel + " celcius");


	}

}
