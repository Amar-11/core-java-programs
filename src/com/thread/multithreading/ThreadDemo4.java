package com.thread.multithreading;

//created by : AMAR on date 2 JUNE '

class MyThreadd extends Thread
{
	
}
public class ThreadDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThreadd t =new MyThreadd();
		t.start();
	}
}
/* if you are not overriding run() method then thread class run method will be executed which  has empty
implimentation , hence we will not get any output .abstract
note : - it is highly reccomanded to override run() method otherwise do not go for 
multithreading concept.
*/
