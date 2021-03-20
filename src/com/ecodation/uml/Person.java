package com.ecodation.uml;

public class Person {

	private long id;
	private String adi;
	private String soyad;
	public String adres;
	public static String memleket;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(long id, String adi, String soyad, String adres) {
		this.id = id;
		this.adi = adi;
		this.soyad = soyad;
		this.adres = adres;
	}

	// method
	public void adSoyad(String adi) {
		this.adi = adi;
		System.out.println();
	}

	// getter and setter
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public static String getMemleket() {
		return memleket;
	}

	public static void setMemleket(String memleket) {
		Person.memleket = memleket;
	}

}
