package org.wanwanframework.level.util;

public class ParseUtil {

	public static final String[] A = "ABCDEFGHIGKLMNOPQRSTUVWXYZ".split("");
	
	public static String point(int index) {
		int i = index - 1;
		int high = i /A.length;
		int low = i % A.length;
		return i < A.length ? A[i] : A[high - 1] + A[low];
	}
	
	public static String point(Integer index) {
		return Integer.toString(index, 26);
	}
	
	public static void main(String[] args) {
		point(100);
		point(new Integer(27));
	}
}
