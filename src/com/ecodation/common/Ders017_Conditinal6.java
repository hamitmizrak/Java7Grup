package com.ecodation.common;

import java.util.Scanner;

public class Ders017_Conditinal6 {

	public static void main(String[] args) {
		//kullanıcadan girdiği ayı ekranda göstersin.
		String ay;
		Scanner klavye = new Scanner(System.in);
		while (true) {
			System.out.println("\nLütfen bir ay giriniz");
			ay = klavye.nextLine();

			switch (ay) {
				case "ocak":
					System.out.println("aylardan ocak");
					break;
				case "subat":
					System.out.println("aylardan subat");
					break;
				case "mart":
					System.out.println("aylardan mart");
					break;
				case "nisan":
					System.out.println("aylardan nisan");
					break;
				case "mayıs":
					System.out.println("aylardan mayıs");
					break;
				case "haziran":
					System.out.println("aylardan haziran");
					break;
				case "temmuz":
					System.out.println("aylardan temmuz");
					break;
				case "agustos":
					System.out.println("aylardan agustos");
					break;
				case "eylul":
					System.out.println("aylardan eylul");
					break;
				case "ekim":
					System.out.println("aylardan ekim");
					break;
				case "kasim":
					System.out.println("aylardan kasim");
					break;
				case "aralik":
					System.out.println("aylardan aralik");
					break;
				default:
					System.out.println("Belirlitilen aralığının dışına çıktınız günleri yazınız");
					break;
			}
		}


	}

}
