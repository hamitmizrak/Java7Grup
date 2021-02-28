package com.ecodation.odev;



public class Odev_008 {

	// Kullanıcı Tarafından Girilen sayının negatif mi pozitif mi
	public static void main(String[] args) {

		int toplam=0;
//		for (int i = 0; i <=10; i=i+2) {
//			toplam+=i;
//		}
		
		for (int i = 0; i <=10; i++) {
			if(i%2==0) {
				toplam+=i;
			}
			
		}
		System.out.println(toplam);

		//s3-)  1'den 10'a kadar sayıların toplamı ancak 5'e bölünebilen sayılar hariç
		//1 2 3 4  6 7 8 9 =40

		
		
	}

}
