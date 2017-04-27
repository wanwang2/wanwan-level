package org.wanwanframework.file.thread;

public class ThreadTool {

	public static void startThread(int threadNumber) {
		for (int i = 1; i <= threadNumber; i++) {
			new Thread(new FileThread(i)).start();
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		ThreadTool.startThread(10);
	}
}
