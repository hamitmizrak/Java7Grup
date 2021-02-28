package com.ecodation.odev;

import java.util.Scanner;

public class Odev_013 {

	// Sınav geçme AA BA CC DC FF
	// Result>=90 AA
	// Result>=80 BA
	// Result>=70 CC
	// Result>=60 DC
	// Result= 50 FF
	// Vize:40% Final:60%

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		double vizeNot,finalNot,sonuc;
		
		System.out.println("Vize notunuzu giriniz");
		vizeNot=klavye.nextDouble();
		
		System.out.println("Final notunuzu giriniz");
		finalNot=klavye.nextDouble();
		
		sonuc=(vizeNot*40)/100+(finalNot*60)/100;
		if(sonuc<50) {
			System.out.println("puanınız:" +sonuc+" Kaldınız");
		}else if(50<=sonuc && sonuc<60) {
			System.out.println("puanınız:" +sonuc+" DC");
		}else if(60<=sonuc && sonuc<70) {
			System.out.println("puanınız:" +sonuc+" CC");
		}else if(70<=sonuc && sonuc<60) {
			System.out.println("puanınız:" +sonuc+" BA");
		}else if(80<=sonuc && sonuc<100) {
			System.out.println("puanınız:" +sonuc+" AA");
		}else {
			System.out.println("belirtilenin dışına çıktınız");
		}

	}

}
