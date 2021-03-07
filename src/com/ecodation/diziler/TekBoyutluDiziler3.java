package com.ecodation.diziler;

import java.util.Arrays;

public class TekBoyutluDiziler3 {

		public static void main(String[] args) {
			String [] iller= {"Malatya","Adana","Burder","Kocaeli"};
			Arrays.sort(iller);
			//iterative for
			for (int i = 0; i < iller.length; i++) {
				System.out.println(iller[i]);
			}

	}

}
