package com.ecodation.common;

import java.util.Scanner;

public class Ders002_Scanner {

	public static void main(String[] args) {
		Scanner klavye=new Scanner(System.in);
		System.out.println("Ad Soyad");
		String adSoyad=klavye.nextLine();
		System.out.println(adSoyad);
		
		
		System.out.println("Bildiğiniz diller");
		int diller=klavye.nextInt();
		System.out.println(diller);
		klavye.close();

	}

}
