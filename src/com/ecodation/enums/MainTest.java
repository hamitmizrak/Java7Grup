package com.ecodation.enums;

public class MainTest {

	public static void main(String[] args) {

		HaftaninGunleri gunleri = HaftaninGunleri.sali;
		System.out.println(gunleri);

		System.out.println("--------------------");
		for (HaftaninGunleri gunleri2 : HaftaninGunleri.values()) {
			System.out.println(gunleri2);
		}

		System.out.println("++++++++++++++++++++++++++");
		Boyutlar boyutlar = Boyutlar.KUCUK;

		System.out.println(boyutlar.getId());
		System.out.println(boyutlar.getBoyut());
		System.out.println(boyutlar.name());
		System.out.println(boyutlar.ordinal());

	}

}
