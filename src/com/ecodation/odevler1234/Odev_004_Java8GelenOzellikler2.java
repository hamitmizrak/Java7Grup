package com.ecodation.odevler1234;

import java.util.Date;

public interface Odev_004_Java8GelenOzellikler2<T> {

	// Default Metodlar
	// Fonksiyonel Arayüz (interface)
	// Lambda ifadeleri ()=>
	// Metod Referansı
	// Tarih ve Saat API si
	// Nasshorn JavaScript Motoru

	public void deneme();

	public void deneme4();

	default void deneme5(int a) {
		Date date = new Date(System.currentTimeMillis());
	}

}
