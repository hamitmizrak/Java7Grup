package com.ecodation.diziler;

public class TekBoyutluDiziler2 {

	public static void main(String[] args) {
		int [] dizi=new int[10];
		dizi[4]=40;
		dizi[0]=1;
		dizi[2]=20;
		dizi[5]=50;
		dizi[6]=60;
		dizi[1]=10;
		dizi[3]=30;
		dizi[7]=70;
		
		
		//iterative for
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i]);
		}
		

	}

}
