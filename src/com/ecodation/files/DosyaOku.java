package com.ecodation.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class DosyaOku {

	public static void main(String[] args) {

		try {
			String pathname = "C:\\fileIO\\java8.txt";
			File file = new File(pathname);
			FileReader in = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(in);
			String okunan = "", satir;
			while ((satir = bufferedReader.readLine()) != null) {
				okunan += satir;
			}

			System.out.println(okunan);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
