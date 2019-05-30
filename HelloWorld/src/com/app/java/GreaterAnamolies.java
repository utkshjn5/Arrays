package com.app.java;

import java.util.Arrays;

public class GreaterAnamolies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 8, 1, 4, 2, 9, 3, 7, 6};
		Arrays.sort(arr);
		int[] res = new int[arr.length];
		int s = 0;
		int g = arr.length-1;
		for(int i=0; i<arr.length;i++) {
			if(i%2==0) {
				res[i] = arr[s];
				s++;
			}else {
				res[i] = arr[g];
				g--;
			}
		}
		for (int e: res) {
			System.out.println(e);
		}
	}

}
