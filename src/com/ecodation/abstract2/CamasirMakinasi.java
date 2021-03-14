package com.ecodation.abstract2;

public class CamasirMakinasi extends BeyazEsya {

	private String merdane;

	public CamasirMakinasi() {
		// TODO Auto-generated constructor stub
	}

	public CamasirMakinasi(long id, String elektrik, String renk, String enerjiSinifi, String merdane) {
		super(id, elektrik, renk, enerjiSinifi);
		this.merdane = merdane;
	}

	@Override
	public void genelOzellikler() {
		System.out.println("Çamaşır makinası");

	}

	public String getMerdane() {
		return merdane;
	}

	public void setMerdane(String merdane) {
		this.merdane = merdane;
	}

	@Override
	public String toString() {
		return "CamasirMakinasi [merdane=" + merdane + ", getId()=" + getId() + ", getElektrik()=" + getElektrik()
				+ ", getRenk()=" + getRenk() + ", getEnerjiSinifi()=" + getEnerjiSinifi() + "]";
	}

}
