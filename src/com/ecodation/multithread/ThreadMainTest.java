package com.ecodation.multithread;

public class ThreadMainTest {

	public static void main(String[] args) throws InterruptedException {

		EsZamanliProcess es1 = new EsZamanliProcess();
		es1.setThreadId(15);
		es1.setName("1.Thread");
		System.out.println(es1.getThreadId() + " " + es1.getName());

		// ------------------------------------------------------------------

		EsZamanliProcess es2 = new EsZamanliProcess();
		es1.setName("2.Thread");
		es2.setThreadId(30);
		System.out.println(es2.getThreadId() + " " + es2.getName());

		// ------------------------------------------------------------------

		System.out.println(es1.getId());
		System.out.println(es2.getId());

		System.out.println("------------");

		// es1.join();
		// es2.join();
		//
		// es1.wait();
		// es1.notify();
		//
		// es2.wait();
		// es2.notify();

		System.out.println("------------");

		es1.start();
		System.out.println(es1.isAlive());
		System.out.println(es2.isAlive());

		es2.start();
	}

}
