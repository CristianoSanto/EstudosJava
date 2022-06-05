package com.extreme.cursojava.aula11;

public class SeparandoUnderscore {

	public static void main(String[] args) {

		long creditCardNumber = 1234_5678_9012_3456l;
		long cpf = 101_122_152_65l;
		float pi = 3.14_15f;
		long hexBytes = 0xff_EC_DE_5El;
		long hexWords = 0xCAFE_BABEl;
		long maxLong = 0x7fff_ffff_ffff_ffffl;
		byte nybbles = 0b0010_0101;
		long bytes = 0b11010010_01101001_10010100_10010010L;
		
		System.out.println("Número de cartão de credito: " + creditCardNumber);
		System.out.println("Número do CPF é: " + cpf);
		System.out.println("Número de pi é: " + pi);
		System.out.println("Número hexaBytes é: " + hexBytes);
		System.out.println("Número hexaWords é: " + hexWords);
		System.out.println("Número maxlong é: " + maxLong);
		System.out.println("Número nybbles é: " + nybbles);
		System.out.println("Número em bytes é: " + bytes);


		
		
	}

}
