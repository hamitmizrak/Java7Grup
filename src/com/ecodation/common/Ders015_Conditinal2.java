package com.ecodation.common;

import java.util.Scanner;

public class Ders015_Conditinal2 {

	public static void main(String[] args) {
		//kullanıcadan girilen isim ve soyisim aynı ise aynı isimdir diye yazsın
		Scanner klavye=new Scanner(System.in);
		
		String defaultNameSurname="Hamit Mızrak",nameSurname;
		
		System.out.println("lütfen adınızı soyadınızı giriniz.");
		nameSurname=klavye.nextLine();
		
		if(defaultNameSurname.equalsIgnoreCase(nameSurname)) {
			System.out.println("İsim ve soyisim aynıdır");
		}else {
			System.out.println("farklı isimlerdir");
		}
		
	}

}
