package com.ecodation.files;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BlobReader {

	public static void main(String[] args) {

		try {
			String databaseGelenVeri = "a{\r\n" + "	color:red;\r\n" + "	background-color:black;\r\n" + "	\r\n"
					+ "}\r\n" + "*{\r\n" + "	padding:0;\r\n" + "	margin:0;\r\n" + "	box-sizing:border-box;\r\n"
					+ "}\r\n" + "\r\n" + ".f20{\r\n" + "	font-size:20rem;\r\n" + "}\r\n";

			Files.write(Paths.get("C:\\fileIO\\deneme2.css"), databaseGelenVeri.getBytes(Charset.forName("utf-8")));

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
