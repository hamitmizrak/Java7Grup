package com.ecodation.project;

public class RegisterDto {

	// nesne değişkenleri
	private long id;
	private String name;
	private String surname;
	private String password;
	private String email;

	public RegisterDto() {
		// TODO Auto-generated constructor stub
	}

	public RegisterDto(long id, String name, String surname, String password, String email) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.password = password;
		this.email = email;
	}

	@Override
	public String toString() {
		return "RegisterDto [id=" + id + ", name=" + name + ", surname=" + surname + ", password=" + password
				+ ", email=" + email + "]";
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
