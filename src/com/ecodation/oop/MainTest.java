package com.ecodation.oop;

public class MainTest {

	public static void main(String[] args) {

		Student student = new Student(1, "Hamit", "Mızrak");
		System.out.println(student);
		System.out.println(student.getName());
		String adim = student.getName();
		System.out.println(adim.concat(" Malatya"));

		// ------------------------------------------------------
		Student student2 = new Student();
		student2.setStudentId(5);
		student2.setName("Mardin");
		student2.setSurname("Ceyhan");
		System.out.println(student2.getName() + " " + student2.getSurname() + " " + student2.getStudentId());
		// --------------------------------------------------------

		if (student2 instanceof Student) {
			System.out.println("Evet bu nesne Student üzerinden gelmiştir");
		} else {
			System.out.println("Hayır bu nesne Student üzerinden gelmemiştir");
		}

	}

}
