package com.arquitecturajava.ejemplo008;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Principal3 {

	public static void main(String[] args) {
		
		String fechaTexto = "10/12/2016";
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		
		try {
			Date miFecha = sdf.parse(fechaTexto);
			Calendar calendario = Calendar.getInstance();
			calendario.setTime(miFecha);
			System.out.println(calendario.get(Calendar.YEAR));
			System.out.println(calendario.get(Calendar.MONTH));
			System.out.println(calendario.get(Calendar.DAY_OF_MONTH));
			SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MMMM/YYYY");
			System.out.println(sdf2.format(miFecha));
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
