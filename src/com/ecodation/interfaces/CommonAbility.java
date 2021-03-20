package com.ecodation.interfaces;

import java.io.Serializable;

abstract public class CommonAbility implements Serializable {
	private static final long serialVersionUID = -8117967940808377622L;

	private long id;
	private String nameSurname;
	private String hesCode;

	// parametreli constructor
	public CommonAbility() {
		// TODO Auto-generated constructor stub
	}

	// parametreli constructor
	public CommonAbility(long id, String nameSurname, String hesCode) {
		this.id = id;
		this.nameSurname = nameSurname;
		this.hesCode = hesCode;
	}

	// toString
	@Override
	public String toString() {
		return "CommonAbility [id=" + id + ", nameSurname=" + nameSurname + ", hesCode=" + hesCode + "]";
	}

	// getter and setter
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNameSurname() {
		return nameSurname;
	}

	public void setNameSurname(String nameSurname) {
		this.nameSurname = nameSurname;
	}

	public String getHesCode() {
		return hesCode;
	}

	public void setHesCode(String hesCode) {
		this.hesCode = hesCode;
	}

}
