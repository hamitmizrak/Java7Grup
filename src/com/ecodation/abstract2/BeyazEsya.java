package com.ecodation.abstract2;

abstract public class BeyazEsya {
	// genel ortak özellikler
	private long id;
	private String elektrik;
	private String renk;
	private String enerjiSinifi;

	// parametresiz constructor
	public BeyazEsya() {
	}

	// parametreli constructor
	public BeyazEsya(long id, String elektrik, String renk, String enerjiSinifi) {
		this.id = id;
		this.elektrik = elektrik;
		this.renk = renk;
		this.enerjiSinifi = enerjiSinifi;
	}

	// gövdeli method
	public void renkMethod() {
		System.out.println(this.renk);
	}

	// gövdesiz method
	abstract public void genelOzellikler();

	// toString
	@Override
	public String toString() {
		return "BeyazEsya [id=" + id + ", elektrik=" + elektrik + ", renk=" + renk + ", enerjiSinifi=" + enerjiSinifi
				+ "]";
	}

	// getter and setter
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getElektrik() {
		return elektrik;
	}

	public void setElektrik(String elektrik) {
		this.elektrik = elektrik;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getEnerjiSinifi() {
		return enerjiSinifi;
	}

	public void setEnerjiSinifi(String enerjiSinifi) {
		this.enerjiSinifi = enerjiSinifi;
	}

}
