package com.ecodation.abstract2;

public class Buzdolabi extends BeyazEsya {

	private String sogutmaOzelligi;

	public Buzdolabi() {
	}

	public Buzdolabi(long id, String elektrik, String renk, String enerjiSinifi, String sogutmaOzelligi) {
		super(id, elektrik, renk, enerjiSinifi);
		this.sogutmaOzelligi = sogutmaOzelligi;
	}

	@Override
	public String toString() {
		return "Buzdolabi [sogutmaOzelligi=" + sogutmaOzelligi + ", getId()=" + getId() + ", getElektrik()="
				+ getElektrik() + ", getRenk()=" + getRenk() + ", getEnerjiSinifi()=" + getEnerjiSinifi()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	public String getSogutmaOzelligi() {
		return sogutmaOzelligi;
	}

	public void setSogutmaOzelligi(String sogutmaOzelligi) {
		this.sogutmaOzelligi = sogutmaOzelligi;
	}

	// Gövdeli method
	@Override
	public void renkMethod() {
		System.out.println("Buzdolabı rengi" + super.getRenk());
	}

	@Override
	public void genelOzellikler() {
		System.out.println("Genel özeliikler: " + super.getId());

	}

}
