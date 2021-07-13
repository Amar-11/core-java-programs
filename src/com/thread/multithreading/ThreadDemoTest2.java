package com.thread.multithreading;

//created by : AMAR on date 2 JUNE 2021

//DEFINING A THREAD by IMPLEMENTING Runnable interface  
// case study like ...........

class MyRunnable implements Runnable 
{
@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread());
		
	}
}
	
public  class ThreadDemoTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable r= new MyRunnable();
		Thread t1= new Thread();
		Thread t2=new Thread();
		
	t1.start();  // case : 1 
		/* after starting thread t1 , a new thread will be created which is responsibile for the execution of
		 * thread class run method which has empty implementation  
		 */
		
	t1.run();        // case : 2 
	/*
	 * no new thread will be created and thread class run method will be execute just like a normal method call 
	 */
	
	//r.start();           // case : 3 
	/*
	 * we wiil get compile time error saying Unresolved compilation problem: 
	The method start() is undefined for the type MyRunnable
	 */
	r.run();    // case :4  no new thread created it called like normal method call 
	
		System.out.println("main thread");
		//System.out.println(Thread.currentThread());
	}
}