package com.thread.multithreading;

//created by : AMAR on date 2 JUNE  

class MyyThred extends Thread   
{
  public void run()
   {
	System.out.println(" run method ");
	}

}
public class ThreadDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyyThred t= new MyyThred();
		t.start();
		System.out.println("main thread ");
	//	t.start();
	/*
	 * after starting a thread if you are trying to restart the same thread then we will get runtime
	 * exception saying IllegalThreadStateException . 	
	 */
		
	}

}
