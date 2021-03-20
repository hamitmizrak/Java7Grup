package com.ecodation.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class DosyaYazdir2 {

	// dosya yazdırma
	public static void main(String[] args) {
		try (BufferedWriter bufferedWriter = new BufferedWriter(
				new FileWriter(new File("C:\\fileIO\\java8.txt"), true))) {
			bufferedWriter.append("satır ekledim" + "\n");
			bufferedWriter.flush();
			System.out.println("eklendi");
		} catch (Exception e) {
			System.out.println("Hata meydana geldi. " + e.getMessage());
			e.printStackTrace();
		}
	}
}
