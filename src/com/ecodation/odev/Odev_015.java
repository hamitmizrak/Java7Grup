package com.ecodation.odev;

import java.util.Scanner;

public class Odev_015 {

	public static void main(String[] args) {

		int x = 0;
		String asilad = "admin";
		// String asilsifre="123456";
		int asilsifre = 123456;
		String ad;
		int sifre;
		
		for (int i = 0; i < 4; i++) {
			Scanner klavye = new Scanner(System.in);
			System.out.println("adi girin");
			ad = klavye.nextLine();
			System.out.println("sifreyi girin");
			sifre = klavye.nextInt();
			if (ad.equals(asilad) && sifre == asilsifre) {

				System.out.println("Giris Basarili");
				break;

			} else {
				System.out.println("Giris basarisiz kalan hak: " + (3 - i));
				x++;
			}
			if (x == 4) {
				System.out.println("Hesap Bloke Oldu");
				break;
			}
		}
	}
}
