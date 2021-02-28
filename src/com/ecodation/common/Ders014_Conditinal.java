package com.ecodation.common;

import java.util.Scanner;

public class Ders014_Conditinal {

	public static void main(String[] args) {
		//kullanıcı bir sayı girsin sonrasında kullanıcının girmiş olduğu sayının üstünü hesaplasın 50 büyük yada küçük olmasını baksın
		double sayi,ustSayi;
		Scanner klavye=new Scanner(System.in);
		System.out.println("Bir sayı giriniz");
		sayi=klavye.nextDouble();
		ustSayi=Math.pow(2, sayi);
		
		if (ustSayi<50) {
			System.out.println(sayi+" üst sayı: "+ustSayi+" Sayı 50 küçüktür");
		} else {
			System.out.println(sayi+" üst sayı: "+ustSayi+"Sayı 50 büyüktür");
		}System.out.println(sayi+"üst sayı: "+ustSayi+"Sayı 50 küçüktür");
		
		
	
		
	}

}
