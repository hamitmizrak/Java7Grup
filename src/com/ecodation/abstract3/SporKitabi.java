package com.ecodation.abstract3;

import java.util.Date;

public class SporKitabi extends Kitap {

	public SporKitabi() {

	}

	public SporKitabi(long id, String kitapAdi, String kitapFiyati, String basimEvi) {
		super(id, kitapAdi, kitapFiyati, basimEvi);
	}

	@Override
	public void kitapBasimEvini() {
		System.out.println("spor kitabı: " + super.getBasimEvi());
		System.out.println(new Date(System.currentTimeMillis()));
	}

	@Override
	public String toString() {
		return "SporKitabi [getId()=" + getId() + ", getKitapAdi()=" + getKitapAdi() + ", getKitapFiyati()="
				+ getKitapFiyati() + ", getBasimEvi()=" + getBasimEvi() + "]";
	}

}
