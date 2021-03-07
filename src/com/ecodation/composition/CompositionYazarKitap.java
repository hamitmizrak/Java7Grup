package com.ecodation.composition;

import java.util.ArrayList;

//acımak Yaprak Dökümü
public class CompositionYazarKitap {

	public static void main(String[] args) {

		Yazar yazar = new Yazar(1, "Neşat Nuri ", "Gültekin");
		yazar.setKitapList(new ArrayList<Kitap>());

		Kitap kitap = new Kitap(1, "çalıkuşu", "2000");
		kitap.setYazar(yazar);
		kitap.getYazar().getKitapList().add(kitap);

		Kitap kitap2 = new Kitap(1, "acımak", "2005");
		kitap2.setYazar(yazar);
		kitap2.getYazar().getKitapList().add(kitap2);

		Kitap kitap3 = new Kitap(1, "Yaprak Dökümü", "200");
		kitap3.setYazar(yazar);
		kitap3.getYazar().getKitapList().add(kitap3);

		System.out.println(yazar);

		for (Kitap yazarfor : kitap3.getYazar().kitapList) {
			System.out.println(yazarfor);
		}

	}

}
