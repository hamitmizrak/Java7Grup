package com.ecodation.common;



public class Ders019_Loop2 {

	public static void main(String[] args) {
		//kullanıcadan girdiği ayı ekranda göstersin.
	
		for (int i = 0; i < 25; i++) {
			if(i==5)
				continue;
			System.out.print(i+" ");
		}
		
	}

}
