package com.ecodation.multithread;

public class EsZamanliProcess extends Thread {

	private long threadId;

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(100);
				System.out.println("thread no: " + threadId + " " + (i + 1));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

	public long getThreadId() {
		return threadId;
	}

	public void setThreadId(long threadId) {
		this.threadId = threadId;
	}

}
