package com.ecodation.kalitim;

public class Student extends Person {
	private static final long serialVersionUID = -609272341384411476L;

	private String hesCode;

	// parametresiz constructor
	public Student() {

	}

	// parametreli constructor
	public Student(long id, String name, String surname, String hesCode) {
		super(id, name, surname);
		this.hesCode = hesCode;
	}

	// Override method
	public void denemeMethod() {
		super.nameSurname();
	}

	// getter and setter
	public String getHesCode() {
		return hesCode;
	}

	public void setHesCode(String hesCode) {
		this.hesCode = hesCode;
	}

	@Override
	public String toString() {
		return hesCode + " " + getId() + " " + getName() + " " + getSurname();
	}

}
