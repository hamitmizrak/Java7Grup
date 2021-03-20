package com.ecodation.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class DosyaYazdir {

	// dosya yazdırma
	public static void main(String[] args) {

		try {
			String pathname = "C:\\fileIO\\java8.txt";
			File file = new File(pathname);
			FileWriter fileWriter = new FileWriter(file, true);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.append("satır ekledim" + "\n");
			bufferedWriter.flush();
			System.out.println("eklendi");

		} catch (Exception e) {
			System.out.println("Hata meydana geldi. " + e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("Burası kesin çalışacak yer");

		}

	}

}
