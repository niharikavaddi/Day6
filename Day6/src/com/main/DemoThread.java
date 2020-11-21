package com.main;

/**
 * Write a program to create a class DemoThread1 implementing Runnable
 * interface. In the constructor, create a new thread and start the thread. In
 * run() display a message "running child Thread in loop : " display the value
 * of the counter ranging from 1 to 10. Within the loop put the thread to sleep
 * for 2 seconds. In main create 3 objects of the DemoTread1 and execute the
 * program.
 * 
 * @author Lakshmi Neeharika
 *
 */
public class DemoThread implements Runnable {

	public static void main(String[] args) {
		DemoThread demoThread1 = new DemoThread();
		DemoThread demoThread2 = new DemoThread();
		DemoThread demoThread3 = new DemoThread();
		Thread thread1 = new Thread(demoThread1);
		Thread thread2 = new Thread(demoThread2);
		Thread thread3 = new Thread(demoThread3);
		thread1.start();
		thread2.start();
		thread3.start();
		demoThread1 = null;
		demoThread2 = null;
		demoThread3 = null;

	}

	@Override
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
