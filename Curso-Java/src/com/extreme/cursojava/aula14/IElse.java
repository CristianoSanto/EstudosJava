package com.extreme.cursojava.aula14;

import java.util.Scanner;


public class IElse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Entre com a idade: ");
		int idade = scan.nextInt();
		
		if (idade >= 18) {
			System.out.println("È maior de idade!");
			
		}else {
			System.out.println("È menor de idade!");
			
		}
		*/
	    //Barato <= 10
		//10 < valor < 15 - Pedir desconto
		//15 <= valor 17 - pesquisar mais 
		//>= 17 - Muito caro
		
		
		System.out.println("Entre com um valor: ");
		double valor = scan.nextDouble();
		
		if (valor <= 10 ) {
			System.out.println("Está barato");
		}
		
		else if  (valor > 10 && valor < 15) {
			System.out.println("Pedir desconto");
		}
		
		else if  (valor >= 15 && valor < 17) {
			System.out.println("Pesquisar mais um pouco");
		}
		
		else {// Valor >= 17
			System.out.println("Está muito caro");
		}
		
		
	}
	
}
			
		
		
		



