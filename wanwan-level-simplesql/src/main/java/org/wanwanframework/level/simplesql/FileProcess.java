/**
 *Author: Jiangtao He; Email: ross.jiangtao.he@gmail.com
 *File Name: FileProcess.java
 *Date: 2011-12-30
 *Copyright: All right reserved by author - Jiangtao He
 */
package org.wanwanframework.level.simplesql;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Author: Jiangtao He; Email: ross.jiangtao.he@gmail.com Since: MyJavaExpert
 * v1.0 Description: this class will implement the common file process.
 */
public class FileProcess {
	/**
	 * Author: Jiangtao He Description: get a buffered file writer according the
	 * file name (with full path) PrintWriter will be more easy to access text,
	 * BufferedWriter is used to cache the data to improve the performance.
	 */
	public PrintWriter getAppendBufferedFilePrintWriter(String sFullFileName) throws IOException {
		PrintWriter oPWriter = new PrintWriter(new BufferedWriter(new FileWriter(sFullFileName, true)));
		return oPWriter;
	}

	/**
	 * Author: Jiangtao He Description: get a buffered file writer according the
	 * file name (with full path) PrintWriter will be more easy to access text,
	 * BufferedWriter is used to cache the data to improve the performance.
	 */
	public PrintWriter getBufferedFilePrintWriter(String sFullFileName) throws IOException {
		PrintWriter oPWriter = new PrintWriter(new BufferedWriter(new FileWriter(sFullFileName)));
		return oPWriter;
	}

	/**
	 * Author: Jiangtao He Description: get a buffered file reader according the
	 * file name (with full path) BufferedReader is used to cache the data to
	 * improve the performance.
	 */
	public BufferedReader getBufferedFileReader(String sFullFileName) throws IOException {
		BufferedReader oBufferedReader = new BufferedReader(new FileReader(sFullFileName));
		return oBufferedReader;
	}

}
