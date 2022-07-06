package com.extreme.cursojava.aula15.Labs;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		
		System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");

		System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");

		System.out.println("       Operação Quiz do CRIME");


		System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");

		System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");


		System.out.println("\nResponda as seguintes perguntas: ");


		System.out.println("Você telefonou para a vítima? ");
		String resp1 = scan.next();

		System.out.println("Você esteve no local do crime? ");
		String resp2 = scan.next();

		System.out.println("Você mora perto da vítima? ");
		String resp3 = scan.next();

		System.out.println("Você devia para a vítima? ");
		String resp4 = scan.next();

		System.out.println("\n5 -> Você já trabalhou com a vítima? ");
		String resp5 = scan.next();
		
		int cont =0;
		
		if (resp1.equalsIgnoreCase("S")) {
			cont ++;
		}
		
		if (resp2.equalsIgnoreCase("S")) {
			cont ++;
		}
		
		if (resp3.equalsIgnoreCase("S")) {
			cont ++;
		}
		
		if (resp4.equalsIgnoreCase("S")) {
			cont ++;
		}
		
		if (resp5.equalsIgnoreCase("S")) {
			cont ++;
		}
		
		if (cont == 2) {
			System.out.println("Você foi considerado 'Suspeito'");
		}
		
		else if  (cont == 3 || cont == 4) {
			System.out.println("Você foi considerado 'Cumplice'");
		}
		
		else if  (cont == 5) {
			System.out.println("Você foi considerado 'Assassino'");
		}
		
		else if  (cont == 0) {
			System.out.println("Você foi considerado 'Inocente'");
		}


	}

}
