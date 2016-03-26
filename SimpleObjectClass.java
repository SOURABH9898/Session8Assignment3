package com.acadglid.java.core.session8.assignment3;

public class SimpleObjectClass implements Runnable {
	static int count=0;
	//run() method of Thread class, that is overridden, and it increments a static count variable by one for each execution.
public void run(){
	for(int i=0;i<10;i++){
		System.out.println("value of i "+(count++)+ "  Thread name is ........" + Thread.currentThread().getName());	
	}
	
}


}
