package com.ecodation.odev;

import java.util.Scanner;

public class Odev_004 {

	// Kullanıcı Tarafından Girilen İki Sayının Toplamı 
	public static void main(String[] args) {
		int sayi1,sayi2;
		Scanner klavye=new Scanner(System.in);
		
		System.out.println("Lütfen 1. sayıyı giriniz");
		sayi1=klavye.nextInt();
		
		System.out.println("Lütfen 2. sayıyı giriniz");
		sayi2=klavye.nextInt();
		
		System.out.println("iki sayı toplamı: "+ (sayi1+sayi2));
		System.out.println("iki sayı cıkarma: "+ (sayi1-sayi2));
		System.out.println("iki sayı çarpımı: "+ (sayi1*sayi2));
		System.out.println("iki sayı bölümü: "+ (sayi1/sayi2));
		System.out.println("iki sayı kalan: "+ (sayi1%sayi2));
		

	}

}
