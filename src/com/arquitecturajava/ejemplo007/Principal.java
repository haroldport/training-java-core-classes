package com.arquitecturajava.ejemplo007;

public class Principal {

	public static void main(String[] args) {
		
		long numero1 = System.currentTimeMillis();
		String cadena = "hola";
		System.out.println(cadena);
		//no hay problemas de concurrencia
		StringBuffer sb = new StringBuffer();
		sb.append(cadena);
		//si puede haber problemas en concurrencia
		StringBuilder sb1 = new StringBuilder();
		
		//el codigo se ejecuta pero rinde muy mal
		for(int i = 0; i < 70000; i++) {
			sb.append("hola");
			sb.append(i);
		}
		long numero2 = System.currentTimeMillis();
		System.out.println(numero2 - numero1);
		System.out.println("************");
		//System.out.println(sb.toString());
		
	}

}
