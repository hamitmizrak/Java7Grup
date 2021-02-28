package com.ecodation.common;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;

public class Ders020_TryCatch {

	public static void main(String[] args) throws IOException {
		
		
		
		try {
			System.out.println("merhabalar");
			int sayi = 5 / 0;
			System.out.println(sayi);
		} catch (ArithmeticException ai) {
			ai.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
			// System.out.println(e.getMessage());
		} finally {
			System.out.println("Burası ne olursa olsun çalışacak");
			//close burada kapatıyoruz. connection.closed();
		}	
		System.out.println("artık burası çalışıyor.");

	}

}
