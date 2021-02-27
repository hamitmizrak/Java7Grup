package com.ecodation.common;

public class Ders001_String {

	public static void main(String[] args) {
	String kelime="Java SE 7 Grup Kursu ";
	System.out.println(kelime);
	System.out.println(kelime.charAt(5));
	System.out.println(kelime.concat(" kuyruk"));
	System.out.println("sonu: "+kelime.endsWith("u"));
	System.out.println("eşit mi: "+kelime.equals("Java SE 7 Grup Kursu"));
	System.out.println("yeter ki doğru yazın: "+kelime.equalsIgnoreCase("Java sE 7 grup KURSU"));
	System.out.println(kelime.indexOf("G"));
	System.out.println("içi boş mu? "+kelime.isEmpty());
	System.out.println(kelime.lastIndexOf("u"));
	System.out.println(kelime.replace("Kursu", " üst düzey Kursu"));
	System.out.println("bununla mı başlıyor ? "+kelime.startsWith("J"));
	System.out.println(kelime.substring(2));
	System.out.println(kelime.substring(0,10));
	System.out.println(kelime.toLowerCase());
	System.out.println(kelime.toUpperCase());
	System.out.println("boyutu: "+kelime.length());
	System.out.println("boyutu: "+kelime.trim().length());

	System.out.println("-------------");
	String [] dizi= kelime.split(" ");
	
	for(String temp: dizi) {
		System.out.println(temp);
	}
	


	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
