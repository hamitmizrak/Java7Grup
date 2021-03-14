package com.ecodation.abstract3;

public class MainTest {

	public static void main(String[] args) {

		Kitap kitap = new SporKitabi(100, "Spor kitabı ", "50", "x-yayıncılık");
		kitap.kitapBasimEvini();
		System.out.println(kitap);

		System.out.println("---------------------------------------------------------------------------------------");

		Kitap kitap2 = new BilgisayarKitabi(200, "Ram kitabı ", "500", "y-yayıncılık");
		kitap2.kitapBasimEvini();
		System.out.println(kitap2);

	}

}
