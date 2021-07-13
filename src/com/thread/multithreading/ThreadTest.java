package com.thread.multithreading;

//created by : AMAR on date 2 JUNE 2021 

//GETTING AND SETTING NAME OF A THREAD   

class MytHread extends Thread
{
	
}
public class ThreadTest {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		
		 MytHread t = new  MytHread ();
		 System.out.println(t.getName());
		 t.setName("amar child 1");
		 System.out.println(t.getName());
		 Thread.currentThread().setName("amar 1");
		 System.out.println(Thread.currentThread().getName());

	}

}
