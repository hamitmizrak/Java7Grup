package com.ecodation.composition;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//1
public class Company extends CommonComputerAndCompany {
	private static final long serialVersionUID = -3612031011094111825L;

	private String companyAddress;
	private String postCode;

	// composition
	private List<Computer> computerList;
	// private List<Computer> computerList = new ArrayList<Computer>();

	public Company() {

	}

	public Company(long id, String name, String date, String companyAddress, String postCode) {
		super(id, name, date);
		this.companyAddress = companyAddress;
		this.postCode = postCode;
	}

	@Override
	public String toString() {
		return "Sirket [companyAddress=" + companyAddress + ", postCode=" + postCode + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getDate()=" + getDate() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(companyAddress, postCode);
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
		Company other = (Company) obj;
		return Objects.equals(companyAddress, other.companyAddress) && Objects.equals(postCode, other.postCode);
	}

	// getter and setter
	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<Computer> getComputerList() {
		if (this.computerList == null) {
			computerList = new ArrayList<Computer>();
			return computerList;
		}
		return computerList;
	}

	public void setComputerList(List<Computer> computerList) {
		this.computerList = computerList;
	}

}
