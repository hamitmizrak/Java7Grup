package com.ecodation.odev;

import java.util.Random;
import java.util.Scanner;

public class Odev_014_Dizi {
/*
 konsoldan kaç elemanlı elemanlı bir dizi olacak bu elemanlara rastgele sayılar girilecek
-a) başlangıç ve bitişi consolden kullanıcı yazacak
-b) ilk sayı ile son sayının toplamını alalım.
-c) bütün sayılar toplamı
-d) metota verecem metot şunu yapacak girilen sayının 10 küçük olup olmadığını kontol edecek.
 */
	
	public static void sonuc(int sayi) {
		if(sayi<10)
			System.out.println("sayı 10 küçüktür");
		else
			System.out.println("sayı 10 büyüktür");
	}
	
	
 	public static void main(String[] args) {
		Scanner klavye=new Scanner(System.in);
		System.out.println("eleman sayısını giriniz");
		int eleman=klavye.nextInt();
		System.out.println("başlangıç sayıyı sayısını giriniz");
		int baslangic=klavye.nextInt();
		System.out.println("bitiş sayıyı sayısını giriniz");
		int bitis=klavye.nextInt();
		int [] dizi=new int[eleman];
		Random random=new Random();
		int rnd,toplam=0;
		for (int i = 0; i < dizi.length; i++) {
			rnd=random.nextInt(bitis)+ baslangic  ;
			dizi[i]=rnd;
			toplam+=dizi[i];
		}
		
		for (int i = 0; i < dizi.length; i++) {
			System.out.print(dizi[i]+" ");
		}
		System.out.println("----------\n");
		System.out.println("ilk sayı: "+dizi[0]  +" ve dizinin son elemenı: "+dizi[dizi.length-1]+" toplamı: "+(dizi[0]+dizi[dizi.length-1]));
		System.out.println("---------\n");
		System.out.println("sayı toplamları: "+toplam);	
		double ortalamasi=toplam/dizi.length;
		System.out.println("sayının ortalaması: "+ ortalamasi  );
		sonuc(toplam);
		int tekSayiSayac=0,ciftSayiSayac=0;
		for (int i = 0; i < dizi.length; i++) {
			if(dizi[i]%2==0) {
				ciftSayiSayac++;
				
		   } if(dizi[i]%2==1){
			   tekSayiSayac++;
		   }
		}
		
		int [] tekSayilar= new int[tekSayiSayac];
		int [] ciftSayilar= new int[ciftSayiSayac];
		
		int tekSayiSayacTekrar=0;
		int ciftSayiSayacTekrar=0;
		for (int i = 0; i < dizi.length; i++) {
			if(dizi[i]%2==0) {
				ciftSayilar[ciftSayiSayacTekrar]=dizi[i];
				ciftSayiSayacTekrar++;
		   }else if(dizi[i]%2==1){
			   tekSayilar[tekSayiSayacTekrar]=dizi[i];
			   tekSayiSayacTekrar++;
		   }
		}
		System.out.println("-------\n");
		System.out.println("tek sayılar sayısı: "+tekSayiSayac);
		System.out.print("tek sayılar: ");
		for (int i = 0; i < tekSayiSayac; i++) {
			System.out.print(tekSayilar[i]+" ");
		}
		System.out.println("\n--------");
		System.out.println("çift sayılar sayısı: "+ciftSayiSayac);
		System.out.print("çift sayılar: ");
		for (int i = 0; i < ciftSayiSayac; i++) {
			System.out.print(ciftSayilar[i]+" ");
		}
	
	}
}
