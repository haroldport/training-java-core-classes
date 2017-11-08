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
		
	}

}
