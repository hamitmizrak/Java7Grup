package com.ecodation.kalitim;

import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID = -844150810294111303L;

	private long id;
	private String name;
	private String surname;

	// parametresiz constructor
	public Person() {

	}

	// parametreli constructor
	public Person(long id, String name, String surname) {
		this.id = id;
		this.name = name;
		this.surname = surname;
	}

	// toString
	@Override
	public String toString() {
		return id + " " + name + " " + surname;
	}

	// method
	public void nameSurname() {
		System.out.println(this.name + " " + this.surname);
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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}
