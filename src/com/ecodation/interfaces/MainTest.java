package com.ecodation.interfaces;

public class MainTest {

	public static void main(String[] args) {

		Teacher teacher = new Teacher(100, "Farid Farjad", " Sx525");
		System.out.println(teacher);

		// polymorphism
		IPerson student = new Student(500, "Hamit Mızrak", " asd854");
		System.out.println(student);

	}

}
