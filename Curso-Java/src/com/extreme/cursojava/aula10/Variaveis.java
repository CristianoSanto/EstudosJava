package com.extreme.cursojava.aula10;

public class Variaveis {

	public static void main(String[] args) {

		//Convenção Java
		int idade = 35;
		String nome = "Cristiano";
		String nickname = "Extreme";
		int ano = 2022;
		
		System.out.println("Idade = " + idade);
		System.out.println("Nome = " + nome);
		System.out.println("Nickname = " + nickname);
		System.out.println("Ano = " + ano);
		
		//
		char o = 111;
		char i = 105;
		char interrogacao = 0x00E1;
		//Transformando 
		System.out.println(o + i);
		//Agora escrevendo "Oi"
		System.out.println("" + o + i);
		System.out.println(interrogacao);

		

	}

}
