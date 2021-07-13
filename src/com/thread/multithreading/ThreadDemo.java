package com.thread.multithreading;

// created by : AMAR on date 2 JUNE 2021

// DEFINING A THREAD BY EXTENDING THREAD CLASS

class MyThread extends Thread   // Thread defining 
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

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread t = new MyThread ();   // thread initiliazation
		t.start();   // starting a thread 
		
		for(int i =0 ;i<10;i++)
		{
			System.out.println("this is main thread ");  // executed  by main thread 
		}
	}
}
/* note :- if multiple thread are waiting to get the chance to execution then in which thread will execute it is 
decided by the thread sheduler , it is varried from  jvm to jvm , hence we cannot expect thread execution order and exact output
hence , situation comes to multithreading there is no gurantee for exact out , but we can provide several posibile output :-
you  can see in output  on console */