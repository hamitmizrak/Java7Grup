package com.ecodation.enums;

public enum Boyutlar {

	KUCUK(1, "kucuk"), ORTA(2, "orta"), BUYUK(3, "buyuk");

	// nesne değişkenleri
	private final int id;
	private final String boyut;

	// parametreli constructor
	private Boyutlar(int id, String boyut) {
		this.id = id;
		this.boyut = boyut;
	}

	// getter and setter
	public int getId() {
		return id;
	}

	public String getBoyut() {
		return boyut;
	}

}
