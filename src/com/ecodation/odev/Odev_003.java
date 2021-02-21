package com.ecodation.odev;

public class Odev_003 {

	// 1.sayı: 20  2.sayı: 10 ==> 
	//2 sayının:  toplamı/çıkarması/bölmesi/çarpımı
	public static void main(String[] args) {
		int sayi1,sayi2,toplam,carpim,cikarma,bolme;
		
		sayi1=20; sayi2=10;
		
		toplam=sayi1+sayi2; 
		System.out.println("toplam: "+toplam  );
		
		carpim=sayi1*sayi2;
		System.out.println("carpim: "+carpim);
		
		cikarma=sayi1-sayi2;
		System.out.println("cikarma: "+cikarma);
		
		bolme=sayi1/sayi2;
		System.out.println("bolme: "+bolme);
		

	}

}
