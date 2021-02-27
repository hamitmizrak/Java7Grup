package com.ecodation.common;

import java.util.Date;
import java.util.StringTokenizer;



public class Ders010_Date {

	public static void main(String[] args) {
		
		Date tarih=new Date();
		System.out.println(tarih);
		
		System.out.println(tarih.getDate());
		System.out.println(tarih.getHours());
		tarih.setHours(21);
		System.out.println(tarih.getHours());
		
		
	}

}
