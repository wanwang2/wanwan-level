package org.wanwanframework.level.util;

public class ParseUtil {

	public static final String Char = "ABCDEFGHIGKLMNOPQRSTUVWXYZ";
	public static final String[] A = Char.split("");
	
	public static String point(int index) {
		int i = index - 1;
		int high = i /A.length;
		int low = i % A.length;
		return i < A.length ? A[i] : A[high - 1] + A[low];
	}
	
	public static String point(Integer index) {
		String[] num = Integer.toString(index, A.length).split("");
		String content = "";
		String bit;
		for (int i = 0; i < num.length; i++) {
			bit = num[i];
			int start = Char.indexOf(bit.toUpperCase());
			if(start > -1) {
				content += A[start + 9];
			} else {
				content += A[Integer.parseInt(num[i]) - 1]; 
			}
		}
		return content;
	}
	
	public static void main(String[] args) {
		//String s = point(1000);
		//System.out.println("s:" + s);
		String rr = point(new Integer(27));
		System.out.println("rr:" + rr);
		String rrr = point(new Integer(1000));
		System.out.println("rr:" + rrr);
	}
}
