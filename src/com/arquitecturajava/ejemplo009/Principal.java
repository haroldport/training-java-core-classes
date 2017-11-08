package com.arquitecturajava.ejemplo009;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		
		LocalDate miFecha = LocalDate.now();
		LocalDate miFecha2 = LocalDate.of(2016, 10, 10);
		System.out.println(miFecha);
		System.out.println(miFecha2);
		System.out.println(miFecha.getMonth());
		System.out.println(miFecha.getDayOfMonth());
		System.out.println(miFecha.getYear());
		System.out.println(miFecha2.isBefore(miFecha));
		LocalDate miFecha3 = miFecha2.withDayOfMonth(20);
		System.out.println(miFecha3);
		
		LocalDate miFecha4 = LocalDate.of(2015, 1, 1);
//		LocalDate miFecha5 = miFecha4.plusYears(1);
//		LocalDate miFecha6 = miFecha5.plusMonths(1);
		//ejemplo de API fluida en Java 8
		System.out.println(miFecha4.plusYears(1).plusMonths(1).plusDays(10));
		
	}

}
