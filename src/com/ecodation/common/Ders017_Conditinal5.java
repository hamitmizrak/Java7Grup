package com.ecodation.common;

import java.util.Scanner;

public class Ders017_Conditinal5 {

	public static void main(String[] args) {
		// haftanın günlerini kullancııdan alınacak ve karar verilecek
		String gun;
		Scanner klavye = new Scanner(System.in);
		while (true) {
			System.out.println("\nLütfen bir gün giriniz");
			gun = klavye.nextLine();

			switch (gun) {
				case "pazar":
					System.out.println("günlerden pazar");
					break;
				case "pazartesi":
					System.out.println("günlerden pazartesi");
					break;
				case "sali":
					System.out.println("günlerden sali");
					break;
				case "cumartesi":
					System.out.println("günlerden cumartesi");
					break;
				case "çarşamba":
					System.out.println("günlerden çarşamba");
					break;
				case "perşembe":
					System.out.println("günlerden perşembe");
					break;
				case "cuma":
					System.out.println("günlerden cuma");
					break;
				default:
					System.out.println("Belirlitilen aralığının dışına çıktınız günleri yazınız");
					break;
			}
		}

	}

}
