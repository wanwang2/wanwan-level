package org.wanwanframework.file.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceTool {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(10);  
		
		Runnable task = new Runnable() {  
			@Override  
			public void run() {  
				System.out.println("task over");  
			}  
		};  
		executorService.execute(task);  
	}
}
