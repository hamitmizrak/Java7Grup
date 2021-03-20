package com.ecodation.files;

import java.nio.file.Files;
import java.nio.file.Paths;

public class BlobReader {

	public static void main(String[] args) {

		try {
			String css = new String(Files.readAllBytes(Paths.get("C:\\fileIO\\write.css")));
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
