package com.main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Write a program to assign the current thread to t1. Change the name of the
 * thread to MyThread. Display the changed name of the thread. Also it should
 * display the current time. Put the thread to sleep for 10 seconds and display
 * the time again.
 * 
 * @author Lakshmi Neeharika
 *
 */
public class ThreadNameChange extends Thread {

	public void run() {
		System.out.println("Running Thread");

	}

	public static void main(String[] args) {
		ThreadNameChange t1 = new ThreadNameChange();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		t1.start();
		t1.setName("MyThread");
		for (int i = 0; i < 10; i++) {
			System.out.println(t1.getName() + " " + LocalDateTime.now().format(formatter));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.err.println(e.toString());
			}
		}
		t1 = null;
		formatter = null;
	}

}
