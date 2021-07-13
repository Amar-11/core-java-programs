package com.thread.multithreading;

//created by : AMAR on date 2 JUNE 2021 

//GETTING AND SETTING NAME OF A THREAD   

class Mythreadd extends Thread 
{
	public void run()
	{
		System.out.println("run method executed by thread : - "+Thread.currentThread().getName());
	}
}

public class ThreadTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythreadd  t = new Mythreadd ();
		t.start();
		t.setName("child thread");
		System.out.println("main  method executed by thread: - "+Thread.currentThread().getName());	
	}

}
