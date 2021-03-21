package com.ecodation.lambda;

@FunctionalInterface
public interface IPerson {
	void denemeMethod();
}

@FunctionalInterface
interface IPerson2 {
	void denemeMethod2(int x, int y);
}

@FunctionalInterface
interface IPerson3 {
	int denemeMethod3();
}

@FunctionalInterface
interface IPerson4 {
	String denemeMethod4(String name, String surname);
}