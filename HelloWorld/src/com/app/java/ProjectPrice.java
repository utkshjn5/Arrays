package com.app.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ProjectPrice {
	
	private int id;
	private double price;
	
	public ProjectPrice(int id , double price) {
		this.id = id;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	
	public double getPrice() {
		return price;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProjectPrice p1 = new ProjectPrice(1, 2000);
		ProjectPrice p2 = new ProjectPrice(1, 3545);
		ProjectPrice p3 = new ProjectPrice(1, 5000);
		
		List<ProjectPrice> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		ProjectPrice p4 = new ProjectPrice(2, 2000);
		ProjectPrice p5 = new ProjectPrice(2, 400);
		ProjectPrice p6 = new ProjectPrice(2, 1000);
		
		List<ProjectPrice> list2 = new ArrayList<>();
		list2.add(p5);
		list2.add(p4);
		list2.add(p6);
		
		List<List<ProjectPrice>> list1 = new ArrayList<>();
		list1.add(list);
		list1.add(list2);
		double temp = 0;
		int id =0;
		Map <Integer,Double> map = new HashMap<>();
		for(List<ProjectPrice> p:list1) {
			for(ProjectPrice px:p) {
				id = px.getId();
				if(px.getPrice() >= temp) {
					temp = px.getPrice();
				}
			}
			map.put(id, temp);
			temp=0;
		}
		
		Iterator<Map.Entry<Integer, Double>> it = map.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<Integer,Double> pair = it.next();
			System.out.println(pair.getKey()+":"+pair.getValue());
			
			}
		
	}

}
