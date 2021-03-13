package com.ecodation.decoderencoder;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.Scanner;

public class DecoderEncoderMain {

	// encoder
	public static String encoderMethod(String kelime) {
		Encoder sifrele = Base64.getEncoder();
		String cevir = sifrele.encodeToString(kelime.getBytes());
		System.out.println(cevir);
		return cevir;
	}

	public static String decoderMethod(String cevirici) {
		Decoder cozucu = Base64.getMimeDecoder();
		String coz = new String(cozucu.decode(cevirici));
		System.out.println(coz);
		return coz;
	}

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen kelime giriniz");
		String kelime = klavye.nextLine();
		String cevir = encoderMethod(kelime);
		decoderMethod(cevir);

		// YWRhbmE=
		// String alper = decoderMethod("YWRhbmE=");
		// System.out.println(alper);

	}

}
