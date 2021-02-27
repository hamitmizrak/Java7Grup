package com.ecodation.common;

import java.util.StringTokenizer;



public class Ders009_StringTokenizer {

	public static void main(String[] args) {
		String kelime="Java JSP JSF Servlet Primefaces || yeni kurs& Hibernate";
		
		java.util.StringTokenizer stringTokenizer=new StringTokenizer(kelime,"&");
		while(stringTokenizer.hasMoreTokens()) {
			String parcala=stringTokenizer.nextToken();
			System.out.println(parcala);
		}
	}

}
