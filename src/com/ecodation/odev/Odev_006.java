package com.ecodation.odev;

import java.util.Scanner;

public class Odev_006 {

	// Kullanıcı Tarafından Girilen sayının negatif mi pozitif mi 
	public static void main(String[] args) {
	
		    //var sayi=5;
			//System.out.println(sayi);
			//int say=0b1111;
		
		Scanner klavye=new Scanner(System.in);
		System.out.println("Sayı giriniz");
		int sayi=klavye.nextInt();
		
		if(sayi<0) {
			System.out.println("Sayı negatiftir");
			System.out.println(sayi);
			sayi=sayi*(-1);
			//Math.abs(sayi);
			System.out.println(sayi);
		}else {
			System.out.println("Sayı pozitiftir.");
		}
		
		
		

	}

}
