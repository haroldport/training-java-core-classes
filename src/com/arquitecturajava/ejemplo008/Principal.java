package com.arquitecturajava.ejemplo008;

import java.util.Calendar;
import java.util.Date;

public class Principal {

	public static void main(String[] args) {
		
		Date dia1 = new Date();
		System.out.println(dia1);
		
		Date dia2 = new Date(10000);
		System.out.println(dia2);
		
		Calendar miCalendario = Calendar.getInstance();
		Date fecha = miCalendario.getTime();
		System.out.println(fecha);
		miCalendario.set(Calendar.YEAR, 2018);
		miCalendario.set(Calendar.MONTH, Calendar.APRIL);
		miCalendario.set(Calendar.DAY_OF_MONTH, 4);
		Date fecha2 = miCalendario.getTime();
		System.out.println(fecha2);

	}

}
