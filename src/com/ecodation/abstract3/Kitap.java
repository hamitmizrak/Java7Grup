package com.ecodation.abstract3;

//genel özellikler
abstract public class Kitap {
	private long id;
	private String kitapAdi;
	private String kitapFiyati;
	private String basimEvi;

	public Kitap() {
		// TODO Auto-generated constructor stub
	}

	public Kitap(long id, String kitapAdi, String kitapFiyati, String basimEvi) {
		this.id = id;
		this.kitapAdi = kitapAdi;
		this.kitapFiyati = kitapFiyati;
		this.basimEvi = basimEvi;
	}

	@Override
	public String toString() {
		return "Kitap [id=" + id + ", kitapAdi=" + kitapAdi + ", kitapFiyati=" + kitapFiyati + ", basimEvi=" + basimEvi
				+ "]";
	}

	// method gövdeli
	public void kitapAdiveKitapFiyati() {
		System.out.println(this.kitapAdi + " " + this.kitapFiyati);
	}

	// method gövdesiz
	abstract public void kitapBasimEvini();

	// getter and setter
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getKitapAdi() {
		return kitapAdi;
	}

	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}

	public String getKitapFiyati() {
		return kitapFiyati;
	}

	public void setKitapFiyati(String kitapFiyati) {
		this.kitapFiyati = kitapFiyati;
	}

	public String getBasimEvi() {
		return basimEvi;
	}

	public void setBasimEvi(String basimEvi) {
		this.basimEvi = basimEvi;
	}

}
