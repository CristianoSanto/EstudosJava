package com.extreme.cursojava.aula12;

import java.util.Scanner;

public class lendoDadosNoTeclado {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Digite seu nome completo: ");
		//scan.next lê o nome completo
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
		System.out.println("Digite seu nome: ");
		//scan.next lê somente o primeiro nome
		String primeiroNome = scan.next();
		System.out.println("Seu nome é: " + primeiroNome);*/
		
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade é: " + idade);
	}

}
