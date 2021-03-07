package com.ecodation.oop;

import java.io.Serializable;
import java.util.Date;

// Bean=  POJO +constructor+toString+hash and equal
public class Student implements Serializable {
	private static final long serialVersionUID = -7566115565991404349L;

	// nesne değişkenleri
	// encapsulation
	private int studentId;
	private String name;
	private String surname;
	private java.util.Date tarih;

	// parametresiz constructor
	public Student() {
		this.studentId = 0;
		this.name = "ad girmediniz";
		this.surname = "soyad girmediniz";
	}

	// parametreli constructor
	public Student(int studentId, String name, String surname, Date tarih) {
		// super();
		this.studentId = studentId;
		this.name = name;
		this.surname = surname;
		this.tarih = tarih;
	}

	// overloading
	public Student(int studentId, String name, String surname) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.surname = surname;
	}

	// toString
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", surname=" + surname + ", tarih=" + tarih + "]";
	}

	// getter and setter
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
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

	public java.util.Date getTarih() {
		return tarih;
	}

	public void setTarih(java.util.Date tarih) {
		this.tarih = tarih;
	}

}
