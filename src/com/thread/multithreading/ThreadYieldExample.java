package com.thread.multithreading;

//created by : AMAR on date 24 JUNE 2021

// YEILD method example 

class ThreadYield extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			{
				System.out.println("chiild thread");
				Thread.yield();

	         }
		}
	}
}
/*
 * IN this program if we are commenting line 12 then both thread will execute simultenously   and we can't expect which thread 
 * will complete first 
 *        if we are not  commenting line 12 then child thread always call yield method because of that main thread 
 *        will get chance more number of times and the chance of completing main thread first is high . 
 */
public class ThreadYieldExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadYield t = new ThreadYield();
		t.start();
		for(int i =0 ; i<10;i++) {
			System.out.println("main thread ");
		}
	}
}
// some os plateform won't get proper support for the yeild method .