package com.ecodation.composition;

import java.io.Serializable;

//N
public class Kitap implements Serializable {
	private static final long serialVersionUID = -4645504275893599215L;

	private long kitapId;
	private String kitapAdi;
	private String kitapBasimYili;

	// composition
	private Yazar yazar;

	public Kitap() {
		// TODO Auto-generated constructor stub
	}

	public Kitap(long kitapId, String kitapAdi, String kitapBasimYili) {
		super();
		this.kitapId = kitapId;
		this.kitapAdi = kitapAdi;
		this.kitapBasimYili = kitapBasimYili;
	}

	@Override
	public String toString() {
		return "Kitap [kitapId=" + kitapId + ", kitapAdi=" + kitapAdi + ", kitapBasimYili=" + kitapBasimYili + "]";
	}

	// getter and setter
	public long getKitapId() {
		return kitapId;
	}

	public void setKitapId(long kitapId) {
		this.kitapId = kitapId;
	}

	public String getKitapAdi() {
		return kitapAdi;
	}

	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}

	public String getKitapBasimYili() {
		return kitapBasimYili;
	}

	public void setKitapBasimYili(String kitapBasimYili) {
		this.kitapBasimYili = kitapBasimYili;
	}

	public Yazar getYazar() {
		return yazar;
	}

	public void setYazar(Yazar yazar) {
		this.yazar = yazar;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
