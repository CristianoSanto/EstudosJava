package com.extreme.cursojava.aula15.Labs;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite uma letra: ");
		String letra = scan.next();
		
	/*if (letra.equals("a") || (letra.equals("e") || (letra.equals("i") ||
			(letra.equals("o") || (letra.equals("u")))))) {
			System.out.println("Vogal");
	}
	else{
		System.out.println("Consoante");
	}*/
		
		if (letra.length() >1) {
			System.out.println("Você digitou mais de uma letra");
		}
			else {
				switch (letra) {
				case "a":
				case "e":
				case "i":
				case "o":
				case "u": 
				case "A":
				case "E":
				case "I":
				case "O":
				case "U": System.out.println("Vogal"); break;
				default: System.out.println("Consoante");
				}
			}
		
		
				
		
}
}
