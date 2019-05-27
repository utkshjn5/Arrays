package com.app.java;

public class SplitAndAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5,6};
		int splitValue = 2;
		int pos =splitValue;
		int [] res = new int [arr.length];
		for(int i=0 ; i<arr.length-splitValue ;i++) {
			res[i]=arr[pos];
			pos++;
		}
		for(int j =0;j<splitValue;j++) {
			res[pos-splitValue] = arr[j];
			pos++;
		}
		for(int element : res) {
			System.out.println(element);
		}
	}

}
