package com.thread.multithreading;

//created by : AMAR on date 2 JUNE 

// OVERLOADING IS run() method possible or not
/*
 * overloading is always possible of run method but thread class start method  can invoke only 
 * no - args run method , the other overloaded method we can call like normal mthod call .  
 */
class MyThread2 extends Thread   
{
	
  public void run()
   {
	System.out.println("This is run () with no args  ");
	}
public void run(int i )
{
	System.out.println("this is run() with args ");
}

}
public class ThreadDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread2 t = new MyThread2();
		t.start();
		// t.run(6);
	}

}
