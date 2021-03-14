package com.ecodation.composition;

import java.util.Objects;

//N
public class Computer extends CommonComputerAndCompany {
	private static final long serialVersionUID = 9040742305434702673L;

	private String computerBarcodeNumber;

	// composition
	private Company company;

	public Computer() {
		// TODO Auto-generated constructor stub
	}

	public Computer(long id, String name, String date, String computerBarcodeNumber) {
		super(id, name, date);
		this.computerBarcodeNumber = computerBarcodeNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(computerBarcodeNumber);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Computer other = (Computer) obj;
		return Objects.equals(computerBarcodeNumber, other.computerBarcodeNumber);
	}

	@Override
	public String toString() {
		return "Bilgisayar [computerBarcodeNumber=" + computerBarcodeNumber + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getDate()=" + getDate() + "]";
	}

	// getter and setter
	public String getComputerBarcodeNumber() {
		return computerBarcodeNumber;
	}

	public void setComputerBarcodeNumber(String computerBarcodeNumber) {
		this.computerBarcodeNumber = computerBarcodeNumber;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

}
