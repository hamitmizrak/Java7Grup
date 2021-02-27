package com.ecodation.odev;

import java.util.Scanner;

public class Odev_005 {

	// Kullanıcı Tarafından Girilen İki Sayı şifre karşılatırması 
	public static void main(String[] args) {
		String sifre1,sifre2;
		Scanner klavye=new Scanner(System.in);
		
		while(true) {
			System.out.println("Lütfen şifre giriniz");
			sifre1=klavye.nextLine();
			
			System.out.println("Lütfen şifreyi tekrar giriniz");
			sifre2=klavye.nextLine();
			
			if(sifre1.equals(sifre2)){
				System.out.println("Şifreler eşleşiyor");
			}else {
				System.out.println("Şifreler EŞLEŞMEDİ");
			}
			
		}
		
		

	}

}
