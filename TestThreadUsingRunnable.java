package com.acadglid.java.core.session8.assignment3;

public class TestThreadUsingRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleObjectClass sim= new SimpleObjectClass();
		Thread t1=new Thread(sim);
		Thread t2=new Thread(sim);
		Thread t3=new Thread(sim);
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t3.setName("Thread 3");
		t3.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		
		/*Though the prioerity is set to MAX, MIN and NORM, the Thread scheduler is the one that does the job,
		of scheduling the Thread execution. So we get varied execution results */
	}

}
