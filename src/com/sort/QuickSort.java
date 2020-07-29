package com.sort;

public class QuickSort {
	
	static void QuickSorting(int[] arr,int low,int high) {
		if(low>high) return;
		int mid = low+(high-low)/2;
		int pivot = arr[mid];
		int i = low;
		int j = high;
		while(i<=j) {
			while(arr[i]<pivot)
				i++;
			while(arr[j]>pivot)
				j--;
			if(i<=j) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		}
		
		if(low<j)
			QuickSorting(arr, low, j);
		if(high>i)
			QuickSorting(arr,i,high);
	}
	
	
	

	public static void main(String[] args) {
		int[] arr= {7,70,8,90,2,55};
		System.out.println("Before Sort");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"\t");
		
		QuickSorting(arr,0,arr.length-1);
		
		System.out.println("After Sort");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"\t");
		
		
	}

}
