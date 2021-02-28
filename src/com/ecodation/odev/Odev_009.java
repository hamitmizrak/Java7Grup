package com.ecodation.odev;

public class Odev_009 {

	// s3-) 1'den 10'a kadar sayıların toplamı ancak 5'e bölünebilen sayılar ve 4'e bölünebilen sayılar hariç
	// 1 2 3   6 7  9 =28
	public static void main(String[] args) {

		int toplam = 0;

		for (int i = 1; i <= 10; i++) {
			if (i % 5 == 0)
				continue;
			toplam += i;

		}
		System.out.println(toplam);

	}

}
