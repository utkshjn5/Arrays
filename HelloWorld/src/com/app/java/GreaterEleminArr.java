package com.app.java;

import java.util.ArrayList;
import java.util.List;

public class GreaterEleminArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {12,10,11,4,8,3,9,7};
		int count =0;
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i] < arr[j]) {
					count++;
				}
			}
			if(count > 1) {
				list.add(arr[i]);
			}
			count=0;
		}
		for(int e : list) {
			System.out.println(e);
		}
	}

}
