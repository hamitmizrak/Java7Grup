package com.ecodation.collectionset;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTutorials {

	public static void main(String[] args) {
		// tekrarsız istiyorsanız
		// H-L-T

		Set<String> setList = new TreeSet<String>();
		setList.add("Hamit");
		setList.add("Ege");
		setList.add("Pelinsu");
		setList.add("Alper");

		Iterator<String> ite = setList.iterator();
		while (ite.hasNext()) {
			System.out.print(ite.next() + " ");
		}

	}

}
