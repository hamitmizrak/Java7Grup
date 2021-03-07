package com.ecodation.diziler;

import java.util.Arrays;

public class TekBoyutluDiziler001 {

	public static void main(String[] args) {
		String [] iller=new String[4];
		iller[0]="Malatya";
		iller[1]="Adana";
		iller[2]="Burder";
		iller[3]="Kocaeli";
				
		Arrays.sort(iller);
		
		//iterative for
		for (int i = 0; i < iller.length; i++) {
			System.out.println(iller[i]);
		}
		

	}

}
