package com.thread.multithreading;

//created by : AMAR on date 24 JUNE 2021

//join method 

//CASE 2 : waiting of child thread until completing main thread

class ThreadJoinm2 extends Thread
{
	static Thread mt;
	public void run() {
		try {
			mt.join();
		}catch (InterruptedException e ) {}
		for(int i =0;i<10;i++) {
			System.out.println("child thread");
		}
	}
}
public class ThreadJoinExample2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 ThreadJoinm2 mt=new  ThreadJoinm2();
		ThreadJoinm2 t = new ThreadJoinm2();
		t.start();
		for(int i =0;i<10;i++) {
			System.out.println("main thread");
			Thread.sleep(2000);
		}
		}
}
/* in this example child thread calls join method on main method object , hence child thread has to 
wait until completing main thread .*/