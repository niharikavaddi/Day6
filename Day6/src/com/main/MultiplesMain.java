package com.main;

/**
 * Write a program to create a class Number which implements Runnable. Run
 * method displays the multiples of a number accepted as a parameter. In main
 * create three objects - first object should display the multiples of 2, second
 * should display the multiples of 5 and third should display the multiples of
 * 8. Display appropriate message at the beginning and ending of thread. The
 * main thread should wait for the first object to complete. Display the status
 * of threads before the multiples are displayed and after completing the
 * multiples
 * 
 * @author Lakshmi Neeharika
 *
 */
public class MultiplesMain implements Runnable {

	public static void main(String[] args) {
		MultiplesMain multiplesMain1 = new MultiplesMain();
		MultiplesMain multiplesMain2 = new MultiplesMain();
		MultiplesMain multiplesMain3 = new MultiplesMain();
		Thread t1 = new Thread(multiplesMain1);
		Thread t2 = new Thread(multiplesMain2);
		Thread t3 = new Thread(multiplesMain3);
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		t1.start();
		t2.start();
		t3.start();
		try {
			System.out.println("t1 status:" + t1.getState());
			System.out.println("t2 status:" + t1.getState());
			System.out.println("t3 status:" + t1.getState());
			t1.join();
			t2.join();
			System.out.println("t1 status:" + t1.getState());
			t3.join();
			System.out.println("t2 status:" + t1.getState());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t1 = null;
		t2 = null;
		t3 = null;
		multiplesMain1 = null;
		multiplesMain2 = null;
		multiplesMain3 = null;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			if (Thread.currentThread().getName().equals("t1"))
				;
			System.out.println(Thread.currentThread().getName() + "  " + i * 2);
			if (Thread.currentThread().getName().equals("t2"))
				System.out.println(Thread.currentThread().getName() + "  " + i * 5);
			if (Thread.currentThread().getName().equals("t3"))
				System.out.println(Thread.currentThread().getName() + "  " + i * 8);
		}

	}
}
