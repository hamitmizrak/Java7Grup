package com.ecodation.composition;

import java.io.Serializable;
import java.util.Objects;

//common
public class CommonComputerAndCompany implements Serializable {
	private static final long serialVersionUID = -4759587250984392177L;
	private long id;
	private String name;
	private String date;

	public CommonComputerAndCompany() {
		// TODO Auto-generated constructor stub
	}

	public CommonComputerAndCompany(long id, String name, String date) {
		this.id = id;
		this.name = name;
		this.date = date;
	}

	@Override
	public String toString() {
		return "CommonComputerAndCompnay [id=" + id + ", name=" + name + ", date=" + date + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CommonComputerAndCompany other = (CommonComputerAndCompany) obj;
		return Objects.equals(date, other.date) && id == other.id && Objects.equals(name, other.name);
	}

	// getter and setter
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
