package com.thread.multithreading;

//created by : AMAR on date 2 JUNE  

// overriding of start method 
/*
 * if we override start() method then our start () method will be executed just like a 
 * normal method call and new thread will not created .
 * 
 * notes:- it's not recommanded to override start method , otherwise don't go for multitheading concept . 
 */
class MyThred extends Thread   
{
	public void start()
	{
		System.out.println("start method ");
	}
	
  public void run()
   {
	System.out.println("This is run method ");
	}

}
public class ThreadDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThred t = new MyThred();
		t.start();
		System.out.println("main thread");
	}

}
