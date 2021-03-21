package com.ecodation.generics;

public class GenericsClassTutorials<T> {

	// generics değişkenler
	private long id;
	private T adi;
	private T adres;

	public GenericsClassTutorials() {
		// TODO Auto-generated constructor stub
	}

	// generics parametreli constructor
	public GenericsClassTutorials(long id, T adi, T adres) {
		this.id = id;
		this.adi = adi;
		this.adres = adres;
	}

	// normal method
	public void tamAd(String a1) {
		System.out.println(a1);
	}

	// generics method
	public <A> void tamAd(A a1, A a2) {
		System.out.println(a1 + "" + a2);
	}

	// getter and setter
	// generics getter and setter
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public T getAdi() {
		return adi;
	}

	public void setAdi(T adi) {
		this.adi = adi;
	}

	public T getAdres() {
		return adres;
	}

	public void setAdres(T adres) {
		this.adres = adres;
	}

}
