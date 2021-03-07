package com.ecodation.composition;

import java.io.Serializable;
import java.util.List;

//1
public class Yazar implements Serializable {
	private static final long serialVersionUID = 1L;

	private long yazarId;
	private String yazarAdi;
	private String yazarSoyadi;

	// composition
	List<Kitap> kitapList;

	public Yazar() {
		// TODO Auto-generated constructor stub
	}

	public Yazar(long yazarId, String yazarAdi, String yazarSoyadi) {
		this.yazarId = yazarId;
		this.yazarAdi = yazarAdi;
		this.yazarSoyadi = yazarSoyadi;
	}

	@Override
	public String toString() {
		return "Yazar [yazarId=" + yazarId + ", yazarAdi=" + yazarAdi + ", yazarSoyadi=" + yazarSoyadi + "]";
	}

	public long getYazarId() {
		return yazarId;
	}

	public void setYazarId(long yazarId) {
		this.yazarId = yazarId;
	}

	public String getYazarAdi() {
		return yazarAdi;
	}

	public void setYazarAdi(String yazarAdi) {
		this.yazarAdi = yazarAdi;
	}

	public String getYazarSoyadi() {
		return yazarSoyadi;
	}

	public void setYazarSoyadi(String yazarSoyadi) {
		this.yazarSoyadi = yazarSoyadi;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<Kitap> getKitapList() {
		return kitapList;
	}

	public void setKitapList(List<Kitap> kitapList) {
		this.kitapList = kitapList;
	}

}
