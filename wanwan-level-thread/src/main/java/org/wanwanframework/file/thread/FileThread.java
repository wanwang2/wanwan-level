package org.wanwanframework.file.thread;

import org.wanwanframwork.file.Log;

/**
 * 文件线程类
 * 
 * @author coco
 *
 */
public class FileThread implements Runnable {

	private int start;

	public FileThread(int start) {
		this.setStart(start);
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	@Override
	public void run() {
		Log.log("start:" + start);
	}
}
