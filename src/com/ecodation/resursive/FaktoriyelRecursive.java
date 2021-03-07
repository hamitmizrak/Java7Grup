package com.ecodation.resursive;

import java.util.Scanner;

public class FaktoriyelRecursive {

	// 4!= 4 * 3 * 2* 1=24
	// 1!=1
	// 0!=1

	public static int recursiveOlmayanMethod(int sayi) {
		int factoriyel = 1;
		if (sayi < 0) {
			System.out.println("sıfırdan küçük sayı veremezsiniz");
			return 0;
		}
		if (sayi == 0 || sayi == 1) {
			return 1;
		} else {
			// çarpanda etkisiz eleman=1
			for (int i = sayi; i >= 1; i--) {
				factoriyel = factoriyel * i;
			}
		}
		return factoriyel;
	}

	public static int recursiveOlanMethod(int sayi) {
		int factoriyel = 1;
		if (sayi < 0) {
			System.out.println("sıfırdan küçük sayı veremezsiniz");
		}
		if (sayi == 0 || sayi == 1) {
			return 1;
		}else {
			return sayi*recursiveOlanMethod(sayi-1);
		}
	}

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz");
		int sayi = klavye.nextInt();
		
		int sonuc = recursiveOlmayanMethod(sayi);
		System.out.println("verdiğiniz sayı:" + sayi + " recursive olmayan faktöriyel sonucu: " + sonuc);
		
		int sonuc2 = recursiveOlanMethod(sayi);
		System.out.println("verdiğiniz sayı:" + sayi + " recursive olan faktöriyel sonucu: " + sonuc2);
		
	}

}
