package com.ecodation.kalitim;

public class InheritanceMainTest {

	public static void main(String[] args) {

		Student student2 = new Student(1, "Hamit", "Mızrak", "sadasd652");

		if (student2 instanceof Student) {
			System.out.println("evet örneğidir");
		} else {
			System.out.println("hayır örneği değildir.");
		}

		System.out.println(student2);
		System.err.println("----------------------------");
		student2.denemeMethod();

	}

}
