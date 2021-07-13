package com.thread.multithreading;

//created by : AMAR on date 2 JUNE  
class MyThread4 extends Thread   
{
	public void start()
	{
		super.start();
		System.out.println("start method ");
	}
	
  public void run()
   {
	System.out.println(" run method ");
	}

}
public class ThreadDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread4 t = new MyThread4();
		t.start();
		System.out.println("main metho0d");
	}

}
/* in this is program there is three posible output :-
run start main
start main run
start run main
*/
