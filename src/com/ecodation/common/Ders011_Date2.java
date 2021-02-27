package com.ecodation.common;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;





public class Ders011_Date2 {

	public static void main(String[] args) {
		
		Locale lokal=new Locale("tr", "TR");
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd MMMM yyyy HH:mm:ss",lokal);
		
		Date tarih=new Date();
		String format=dateFormat.format(tarih);
		System.out.println(format);
		

		
		
	}

}
