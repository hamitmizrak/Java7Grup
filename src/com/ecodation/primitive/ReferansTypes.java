package com.ecodation.primitive;

public class ReferansTypes {

	public static void main(String[] args) {
		//B < S < I < L
		//heap hafıza: Referans
		
		Byte b1=new Byte((byte) 12);
		System.out.println(b1);
		
		Short s1=new Short((short)15);
		System.out.println(s1+b1);
		
		Integer i1=new Integer( 12);
		System.out.println(i1);
		
		Long l1=new Long((long) 12);
		System.out.println(l1);
		
		Float f2=new Float( 12.44);
		System.out.println(f2);
		
		Double  d2=new Double( 44.55);
		System.out.println(d2);
		
		Boolean b3=new Boolean(true);
		System.out.println(b3);
		
		Character c4=new Character('Ş');
		System.out.println(c4);

	}

}
