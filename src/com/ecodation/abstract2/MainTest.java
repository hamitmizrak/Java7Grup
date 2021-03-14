package com.ecodation.abstract2;

public class MainTest {

	public static void main(String[] args) {

		// BeyazEsya beyazEsya = new BeyazEsya(1, "elektrik", "kırmızı", "A++");

		Buzdolabi buzdolabi = new Buzdolabi(200, "elektrikli", "beyaz", "A+", "nofrosh");
		System.out.println(buzdolabi);
		buzdolabi.renkMethod(); // polymorphism
		buzdolabi.genelOzellikler(); // polymorphism

		BeyazEsya buzdolabi2 = new Buzdolabi(300, "elektrikli", "Kirli beyaz", "A+++", "nofrosh");// polymorphism
		System.out.println(buzdolabi2);
		buzdolabi2.renkMethod(); // polymorphism
		buzdolabi2.genelOzellikler(); // polymorphism

		CamasirMakinasi camasirMakinasi = new CamasirMakinasi(400, "elektrikli", "yeşil", "A++", "merdaneli");
		System.out.println(camasirMakinasi);
		camasirMakinasi.renkMethod(); // polymorphism
		camasirMakinasi.genelOzellikler(); // polymorphism

	}

}
