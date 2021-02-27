package com.ecodation.common;

import java.util.Random;

public class Ders006_Random {

	public static void main(String[] args) {
	
		//Random math classları
		//System.out.println(Math.round(Math.random()*3+1));
		
		//Random Object class düzeyinde
		java.util.Random random=new Random();
		int rastgeleSayi=random.nextInt(3)+1;
		//System.out.println(rastgeleSayi);
		
		int rastgeleSayi2=0,toplam=0;
		//
		for (int i = 0; i < 10; i++) {
			rastgeleSayi2=random.nextInt((i+1))+1;
			toplam+=rastgeleSayi2;
			System.out.print("sayılar: "+rastgeleSayi2+"\n");
			System.out.print("toplam: "+toplam+"\n");
		}
		
	
	}

}
