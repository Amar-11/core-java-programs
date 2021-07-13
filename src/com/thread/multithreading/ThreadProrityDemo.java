package com.thread.multithreading;

//created by : AMAR on date 12 JUNE 2021

class MyThreadProirity extends Thread
{
	public void run(){
		for(int i =0;i<10;i++)
		{
			System.out.println("this is child thread");
		}
	}
}
public class ThreadProrityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThreadProirity t = new MyThreadProirity();
		t.setPriority(1);
	/*
	 * 	if we are commenting line 19 then both main and child thread has same priority 5 and hence we can't expect execution order 
	 * and exact output .
	 * if you are commenting line 19 then main thread has priority 5 and child thread priority 10 , hence child thread will get 
	 * the chance first followed by main thread . in this case output is child thread child thread 10 times followed by main 
	 * thread main thread 10 times 
	 */
		
// note :- some plate forms won't provide proper support for thread priorities .		
		
		t.start();
		
		for(int i =0;i<10;i++)
		{
		System.out.println("main thread ");
		}
		
	}
}
