package com.arquitecturajava.ejemplo001;

public class Principal {

	public static void main(String[] args) {
		
		int numero = 7;
		Integer miEntero = new Integer(numero);
		String numeroCadena = miEntero.toString();
		
		System.out.println(numeroCadena);
		
		String numero2 = "14";
		String numero3 = "25";
		System.out.println(numero2 + numero3);
		int resultado = Integer.parseInt(numero2) + Integer.parseInt(numero3);
		System.out.println(resultado);
		
		int nuevoNumero = miEntero.intValue() + 5;
		System.out.println(nuevoNumero);
		
	}

}
