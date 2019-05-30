package com.app.java;

import java.util.ArrayList;
import java.util.List;

public class MiddleElemList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ptr1 = 0;
		int ptr2 = 0;
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i=1;i<=21;i++) {
			list.add(i);
		}
		//System.out.println(list.size());
		for(int i=0;i<=list.size();i++) {
			ptr2 = ptr2 + 2;
			ptr1++;
			if(ptr2 == list.size() || ptr2 > list.size()) {
				break;
			}
		}
		System.out.println(ptr1);
	}

}
