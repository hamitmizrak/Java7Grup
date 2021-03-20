package com.ecodation.interfaces;

import java.io.Serializable;

public class Teacher extends CommonAbility implements IPerson, Serializable {
	private static final long serialVersionUID = 1L;

	public Teacher() {

	}

	public Teacher(long id, String nameSurname, String hesCode) {
		super(id, nameSurname, hesCode);
	}

	@Override
	public String toString() {
		return "Teacher [getId()=" + getId() + ", getNameSurname()=" + getNameSurname() + ", getHesCode()="
				+ getHesCode() + "]";
	}

	@Override
	public void kapiAc() {
		System.out.println(super.getId() + " " + super.getNameSurname() + " kapi açıldı");

	}

	@Override
	public void marketeGit() {
		System.out.println(super.getId() + " " + super.getNameSurname() + " markete gidildi");

	}

	@Override
	public void paraVer() {
		System.out.println(super.getId() + " " + super.getNameSurname() + " para verildi");

	}

	@Override
	public void eveGel() {
		System.out.println(super.getId() + " " + super.getNameSurname() + " eve gelindi");

	}

}
