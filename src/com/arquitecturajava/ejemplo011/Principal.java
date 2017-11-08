package com.arquitecturajava.ejemplo011;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Principal {

	public static void main(String[] args) {
		
		String textoFacturas = "Las facturas son 123AB y 234CD";
		String regex = "\\d{3}[A-Z]{2}";
		
		//expresion regular compilada
		Pattern patron = Pattern.compile(regex);
		Matcher coincidencias = patron.matcher(textoFacturas);
		
		//System.out.println(coincidencias.find());
		
		while(coincidencias.find()) {
			//limita el texto que coincide con la expresion regular
			int inicio = coincidencias.start();
			int fin = coincidencias.end();
			System.out.println(textoFacturas.substring(inicio, fin));
		}
		
	}

}
