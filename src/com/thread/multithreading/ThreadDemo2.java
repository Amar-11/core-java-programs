package com.thread.multithreading;

//created by : Amar on date 2 june 

// IMORTANTANCE OF THREAD CLASS START METHOD UNDER THE THREAD 
/*
 * start method is responsible to register the thread with the thread sheduller and all mendantory activities 
 * hence without start method there is no chance of starting a new thread in java , due to this thread class start method 
 * is considered as  heart of Multithreading 
 */

class MyThread1 extends Thread   
{
	
  public void run()
   {
	  //job of thread 
	for(int i=1;i<10;i++)
		{
			// executed by the child thread 
		System.out.println("This is child thread ");
			}
	}
  
}
public class ThreadDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 t = new MyThread1();
		
		System.out.println("this is exceted by main thread ");
	}

}
// you can see in output there run method does not call because i did not write start method  