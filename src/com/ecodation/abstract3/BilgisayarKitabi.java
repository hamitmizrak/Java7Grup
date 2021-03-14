package com.ecodation.abstract3;

public class BilgisayarKitabi extends Kitap {

	public BilgisayarKitabi() {
		// TODO Auto-generated constructor stub
	}

	public BilgisayarKitabi(long id, String kitapAdi, String kitapFiyati, String basimEvi) {
		super(id, kitapAdi, kitapFiyati, basimEvi);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void kitapBasimEvini() {
		System.out.println("bilgisayar kitabı: " + super.getBasimEvi());
	}

	@Override
	public String toString() {
		return "BilgisayarKitabi [getId()=" + getId() + ", getKitapAdi()=" + getKitapAdi() + ", getKitapFiyati()="
				+ getKitapFiyati() + ", getBasimEvi()=" + getBasimEvi() + "]";
	}

}
