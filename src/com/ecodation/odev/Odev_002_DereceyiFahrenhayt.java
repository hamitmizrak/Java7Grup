package com.ecodation.odev;

public class Odev_002_DereceyiFahrenhayt {

	/*
	
	(dereceSayisi * 9 / 5) + 32;


	 */
	public static void main(String[] args) {
	
		int dereceSayisi=5000;
		int sonuc=(dereceSayisi * 9 / 5) + 32;
		System.out.println(sonuc);
		
		//4+3*2(3:3-1*6+9:1+(3:3))
		int result=4+3*2*(3/3-1*6+9/1+(3/3));
		System.out.println(result);

		
	}
}
