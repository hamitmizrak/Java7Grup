package com.ecodation.composition;

import java.util.ArrayList;

public class CompositionMainTest {

	public static void main(String[] args) {
		Ogretmen ogretmen = new Ogretmen(1, "Hamit", "Mızrak");
		ogretmen.setOgrenciList(new ArrayList<Ogrenci>());

		Ogrenci ogrenci = new Ogrenci(1, "Alper", "Ziyan");
		ogrenci.setOgretmen(ogretmen);
		ogrenci.getOgretmen().getOgrenciList().add(ogrenci);

		Ogrenci ogrenci2 = new Ogrenci(1, "Ege", "Helvacı");
		ogrenci2.setOgretmen(ogretmen);
		ogrenci2.getOgretmen().getOgrenciList().add(ogrenci2);

		Ogrenci ogrenci3 = new Ogrenci(1, "Pelinsu", "Öztürk");
		ogrenci3.setOgretmen(ogretmen);
		ogrenci3.getOgretmen().getOgrenciList().add(ogrenci3);

		Ogrenci ogrenci4 = new Ogrenci(1, "Muhammed", "Seyit");
		ogrenci4.setOgretmen(ogretmen);
		ogrenci4.getOgretmen().getOgrenciList().add(ogrenci4);

		System.out.println(ogrenci4.getOgretmen());
		System.out.println("---------------------------------------");

		for (Ogrenci ogrenciList : ogretmen.getOgrenciList()) {
			System.out.println(ogrenciList);
		}
	}
}
