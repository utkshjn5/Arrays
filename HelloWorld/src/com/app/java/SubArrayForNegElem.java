package com.app.java;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubArrayForNegElem {
	
	public static void main(String[] args) {
		long stime = System.currentTimeMillis();
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(1);
		list.add(3);
		list.add(7);
		list.add(2);
		list.add(4);
		
		Collections.sort(list);
		int cap=getMissingElem(list);
		System.out.println(cap);
		long etime = System.currentTimeMillis();
		
		NumberFormat formatter = new DecimalFormat("#0.00000");
		System.out.print("Execution time is " + formatter.format((etime - stime) / 1000d) + " seconds");
	}

	private static int getMissingElem(List<Integer> list) {
		// TODO Auto-generated method stub
		int missingElem = 0;
		for(int i= 0;i<list.size()-1;i++) {
			if((list.get(i+1)-list.get(i))!=1) {
				missingElem = list.get(i)+1;
				break;
			}
		}
		return missingElem;
	}

	
}
