package com.extreme.cursojava.aula13.Labs;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de metros: ");
		double metros = scan.nextDouble();
		
		double cm = metros * 100;
		System.out.println(metros + " metros é igual a " + cm + " cetímetros");
		

		
	}

}
