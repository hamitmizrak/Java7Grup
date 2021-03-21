package com.ecodation.lambda;

public class MainTest {

	public static void main(String[] args) {

		// 1 interface
		IPerson iPerson = () -> System.out.println("Java");
		iPerson.denemeMethod();

		// 2 interface
		IPerson2 iPerson2 = (int m, int k) -> {
			System.out.println("toplama: " + (m + k));
		};
		iPerson2.denemeMethod2(5, 6);

		// 3 interface
		IPerson3 iPerson3 = () -> {
			return 5;
		};
		int sayi = iPerson3.denemeMethod3();
		System.out.println(sayi);

		// 4 interface
		IPerson4 iPerson4 = (String name, String surname) -> {
			return name + " " + surname;
		};

		String fullName = iPerson4.denemeMethod4("Hamit", "Mızrak");
		System.out.println(fullName);

	}

}
