package com.ecodation.common;

 public class Ders024_recursiveFactoriyel {
	 
	public static void voidliParametresiz() {
		int a,b,sonuc;
		a=5;
		b=10;
		sonuc=a+b;
		System.out.println(sonuc);
	}
	
	public static void voidliParametreli(int a,int b) {
		int sonuc=a+b;
		System.out.println(sonuc);
	}
	
	public static int voidsizParametresiz() {
		int a,b;
		a=5;
		b=10;
		return a+b;
	}
	
	//int a,int b =Parametrelerdir
	public static int voidsizParametreli(int a,int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		voidliParametresiz();
		
		// (10, 20) =Argümandır
		voidliParametreli(10, 20);
		
		int result=voidsizParametresiz();
		System.out.println(result);
		
		int result2= voidsizParametreli(85,15);
		System.out.println(result2);
	}

}


