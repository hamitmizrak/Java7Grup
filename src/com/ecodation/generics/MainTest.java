package com.ecodation.generics;

public class MainTest {
	public static void main(String[] args) {
		GenericsClassTutorials<String> generic = new GenericsClassTutorials<String>();
		generic.setId(10);
		generic.setAdi("Hamit");
		generic.setAdres("Turkey");

		System.out.println(generic.getId() + " " + generic.getAdi() + " " + generic.getAdres() + " ");

		generic.tamAd("Java");
		generic.tamAd("Java", '\u4455');

	}
}
