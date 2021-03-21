package com.ecodation.collectionlist;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.sun.org.apache.bcel.internal.classfile.ClassFormatException;

public class ListTutorials {

	public static void main(String[] args) throws NullPointerException, ClassFormatException {

		// arraylist=Asenkron
		List<String> listem = new LinkedList<>();
		listem.add("Hamit");
		listem.add("Ege");
		listem.add("Pelinsu");
		listem.add("Alper");

		for (String temp : listem) {
			System.out.println(temp);
		}
		System.out.println("--------------------------------------");

		Collections.sort(listem);
		listem = Collections.unmodifiableList(listem);
		listem.add("Java");

		Iterator ite = listem.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());

		}

		// senkron olarak çalışıyor.
		Vector vector = new Vector();

	}

}
