package com.ecodation.composition;

public class BilgisayarSirketMainTest {

	public static void main(String[] args) {

		// Şirket olmazsa olmaz
		Company company = new Company(101, "Apple", "2021", "American", "45254");
		// company.setComputerList(new ArrayList<Computer>());

		System.out.println(company);

		Computer computer = new Computer(200, "Apple computer", "2018", "Axc552L");
		computer.setCompany(company);
		computer.getCompany().getComputerList().add(computer);
		System.out.println(computer);

		if (company instanceof Company) {
			System.out.println("Evet aittir");
		} else {
			System.out.println("Hayır ait değildir");
		}

	}

}
