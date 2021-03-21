package com.ecodation.collectionlist;

import java.util.ArrayList;
import java.util.List;

import com.sun.org.apache.bcel.internal.classfile.ClassFormatException;

public class IteratorDongu {

	public static void main(String[] args) throws NullPointerException, ClassFormatException {

		List<String> listem = new ArrayList<>();
		listem.add("Hamit");
		listem.add("Ege");
		listem.add("Pelinsu");
		listem.add("Alper");

		List<String> listem2 = new ArrayList<>();
		listem2.add("Java");
		listem2.add("EE");
		listem2.add("Spring");
		listem2.add("JPA");

		if (!listem.isEmpty()) {
			System.out.println(listem.get(0));
			System.out.println(listem.size());
			listem.addAll(listem2);
			System.out.println("----------------------SubList----------------");

			for (String temp : listem.subList(0, listem.size())) { // 0<=x<= (2-1)
				System.out.println(temp);
			}

			System.out.println("----------------------indexOf----------------");
			System.out.println(listem.indexOf("Alper"));

			System.out.println("--------------------------------------");
			for (String temp : listem) {
				System.out.println(temp);
			}
			System.out.println("--------------------------------------");
			listem.remove(0);
			// listem.clear();
			for (String temp : listem) {
				System.out.println(temp);
			}

			System.out.println("--------------------------------------");
		}

	}

}
