package com.app.java;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "niaj hsraktU";
	    char[] test = str.toCharArray();
	    StringBuilder sb = new StringBuilder();
	    for(int i= test.length-1;i>=0;i--) {
	    	sb.append(test[i]);
	    }
	    System.out.println(sb.toString());
	}

}
