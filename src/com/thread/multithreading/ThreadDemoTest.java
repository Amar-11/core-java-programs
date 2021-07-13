package com.thread.multithreading;

//created by : AMAR on date 2 JUNE  

// DEFINING A THREAD by IMPLEMENTING Runnable interface 

class MyyRunnable implements Runnable 
{
	public void  run() {
		// job of thread 
		for(int i =0; i<10;i++)
		{
			System.out.println("child thread");// executing by child thread
		}
	}
}
public class ThreadDemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyyRunnable r= new MyyRunnable();
		
		Thread t = new Thread(r);// r target Runnable
		t.start();
		for(int i = 0;i<10;i++)
		{
			System.out.println("main thread "); // executing by main thread 
		}
	}
}
/* we cant tell exact output because we don't thread  sheduller which thread give priority 
it differ jvm to jvm ,we can say possible output just */