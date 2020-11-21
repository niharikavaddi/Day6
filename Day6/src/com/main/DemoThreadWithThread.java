package com.main;

/**
 * Rewrite the earlier program so that, now the class DemoThread1 instead of
 * implementing from Runnable interface, will now extend from Thread class.
 * 
 * @author Lakshmi Neeharika
 *
 */
public class DemoThreadWithThread extends Thread {

	public static void main(String[] args) {
		DemoThreadWithThread demoThreadWithThread1 = new DemoThreadWithThread();
		DemoThreadWithThread demoThreadWithThread2 = new DemoThreadWithThread();
		DemoThreadWithThread demoThreadWithThread3 = new DemoThreadWithThread();
		demoThreadWithThread1.start();
		demoThreadWithThread2.start();
		demoThreadWithThread3.start();
		demoThreadWithThread1 = null;
		demoThreadWithThread2 = null;
		demoThreadWithThread3 = null;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Running Child Thread " + (i + 1));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
