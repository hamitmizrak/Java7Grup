package com.ecodation.common;



import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;





public class Ders012_Calendar {

	public static void main(String[] args) {
		
		Locale lokal=new Locale("tr", "TR");
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd MMMM yyyy HH:mm:ss",lokal);
		
		Calendar tarih=Calendar.getInstance();
		String format=dateFormat.format(tarih.getTime());
		System.out.println(format);
		

		
		
	}

}
