package com.main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * In the previous program remove the try{}catch(){} block surrounding the sleep
 * method and try to execute the code. What is your observation?
 * 
 * @author Lakshmi Neeharika
 *
 */
public class ThreadSleep extends Thread {

	public static void main(String[] args) {
		ThreadSleep t1 = new ThreadSleep();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		t1.start();
		t1.setName("MyThread");
		for (int i = 0; i < 10; i++) {
			System.out.println(t1.getName() + " " + LocalDateTime.now().format(formatter));
			try {
				Thread.sleep(1000); // It throws an Interrupted Exception which needs to be handled
			} catch (InterruptedException e) {
				System.err.println(e.toString());
			}
		}
		t1 = null;
		formatter = null;

	}

}
