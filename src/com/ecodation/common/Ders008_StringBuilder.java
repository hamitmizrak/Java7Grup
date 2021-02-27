package com.ecodation.common;


public class Ders008_StringBuilder {

	public static void main(String[] args) {
		java.lang.StringBuilder builder = new StringBuilder();
		builder.append("a1 ").append("a2 ").append("a3");
		String cevir=builder.toString();
		System.out.println(cevir+" ");

	}

}
