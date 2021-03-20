package com.ecodation.files;

import java.io.File;
import java.io.IOException;

public class FileTutorials {

	public static void main(String[] args) throws IOException {

		String pathname = "C:\\fileIO\\java8.txt";
		File file = new File(pathname);
		System.out.println(file.canExecute());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());

		System.out.println(file.isHidden());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.isAbsolute());

		System.out.println(file.getAbsolutePath());
		System.out.println(file.getCanonicalPath());
		System.out.println(file.getFreeSpace());
		System.out.println(file.getTotalSpace());
		System.out.println(file.getName());
		System.out.println(file.getParent());
		System.out.println(file.getClass());

		for (String temp : file.list()) {
			System.out.println(temp);
		}

	}

}
