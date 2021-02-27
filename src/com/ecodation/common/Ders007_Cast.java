package com.ecodation.common;

import java.util.Random;

public class Ders007_Cast {

	public static void main(String[] args) {

		// 1-Cast
		float f1 = 44.44f;
		long l1 = 451522222262L;

		// 2-) küçük balık ,büyük balık
		// b < s < i < l
		byte b2=127;
		int i2=b2;
		
		long l22=5454151515L;
		byte b22=(byte)l22;
		
		//3 Boxing -unboxing
		//boxing
		int i3=4455;
		Integer i8=i3; //Boxing
		
		Integer i9=new Integer(99); //unboxing
		int i4=i9;
		
		//4.cast
		int sayi=66;
		String str2=String.valueOf(sayi);
		String str3=Integer.toString(sayi);
		
		//5.cast
		String kelimeSayi="99";
		int sayi2=Integer.valueOf(kelimeSayi);
		int sayi3=Integer.parseInt(kelimeSayi);
		
	}

}
