package com.arquitecturajava.ejemplo006;

public class Principal {

	public static void main(String[] args) {
		
		long numero1 = System.currentTimeMillis();
		String cadena = "hola";
		System.out.println(cadena);
		//el codigo se ejecuta pero rinde muy mal
		for(int i = 0; i < 70000; i++) {
			cadena = cadena + " hola " + i;
		}
		long numero2 = System.currentTimeMillis();
		System.out.println(numero2 - numero1);
		
	}

}
