package com.app.java;

public class MergeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = {1,2,5,7};
		int [] arr2 = {2,3,6,9,10};
		int [] res = new int[arr1.length + arr2.length];
		getMergedArray(arr1,arr2,res);
		for(int element: res) {
			System.out.println(element);
		}
	}
	private static void getMergedArray(int[] arr1, int[] arr2, int[] res) {
		int i=0,j=0,k=0;
		while(i<arr1.length && j <arr2.length) {
			
			if(arr1[i] <= arr2[j]) {
				res[k] = arr1[i];
				i++;
			}else {
				res[k] = arr2[j];
				j++;
			}
			k++;
		}
		while(i<arr1.length) {
			res[k] = arr1[i];
			i++;
			k++;
		}
		while(j<arr2.length) {
			res[k] = arr2[j];
			j++;
			k++;
		}
	}
}
