package com.thread.multithreading;

//created by : AMAR on date 24 JUNE 2021

// join method 

// CASE 1 : waiting of main thread until completing child thread

class ThreadJoinm1 extends Thread {
	public void run() {
		for(int i =0 ;i<10;i++) {	
		System.out.println("amar child thread");
		try {
			Thread.sleep(2000);
		}
		catch (InterruptedException e ) {}
 }
 }
}

public class ThreadJoinExample {
 
	public static void main (String args[]) throws InterruptedException{
		ThreadJoinm1 t = new ThreadJoinm1();
		t.start();
		t.join();
		for(int i =0;i<10;i++) {
			System.out.println("amar main thread ");
		}
	}
}
/* if we comment line 26 then both thread will be execute simultenously and we won't get exact output .
 *  if we are not commenting line 26 then main thread call join method on child thread object here main 
 *  thread will wait until completing child thread .*/
