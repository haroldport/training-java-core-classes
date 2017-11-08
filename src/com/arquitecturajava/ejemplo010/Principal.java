package com.arquitecturajava.ejemplo010;

public class Principal {

	public static void main(String[] args) {
		
		String mensaje = "Hola que tal estas es 10 de Septiembre";
		
		//meta carecter de espacio en blanco \s se pone otro \ con fin de escapar
		String[] lista = mensaje.split("[\\s]");
		for(String s: lista) {
			System.out.println(s);
		}
		
		//meta caracter todas las vocales
		String[] lista2 = mensaje.split("[aeiou]");
		for(String s: lista2) {
			System.out.println(s);
		}
		
		//meta caracter rangos de letras
		String[] lista3 = mensaje.split("[a-d]");
		for(String s: lista3) {
			System.out.println(s);
		}
		
		//meta caracter digitos
		String[] lista4 = mensaje.split("\\d");
		for(String s: lista4) {
			System.out.println(s);
		}
		
		//meta caracter digitos, especificando cuantos
		String[] lista5 = mensaje.split("\\d{2}");
		for(String s: lista5) {
			System.out.println(s);
		}
		
		String textoClientes = "El cliente A tiene de clave clave1234"
				+ ", el cliente B tiene clave otraClave3425";
		
		String nuevoTexto = textoClientes.replaceAll("[a-zA-Z]{3,10}\\d{4}", "XXXXXX");
		System.out.println(nuevoTexto);
		
	}

}
