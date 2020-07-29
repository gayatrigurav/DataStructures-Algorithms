package com.sort;

public class Bubblesort {
	
	static void BubbleSort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		for(int i = 0;i<n;i++)
			for(int j=1;j<n;j++) {				
				if(arr[j-1]>arr[j]) {
					System.out.println("j-1" + arr[j-1] +" is greater than j " + arr[j]);
					System.out.println("i = " + i + ", arr["+ i +"] = "+ arr[i]);
					System.out.println("j = " + j + ", arr["+ j +"] = "+ arr[j]);
					System.out.println("j-1 = " + (j-1) + ", arr["+ (j-1) +"] = "+ arr[j-1]);
					temp = arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
				else
				{
					System.out.println("j-1" + arr[j-1] +" is less than j " + arr[j]);
					System.out.println("i = " + i + ", arr["+ i +"] = "+ arr[i]);
					System.out.println("j = " + j + ", arr["+ j +"] = "+ arr[j]);
					System.out.println("j-1 = " + (j-1) + ", arr["+ (j-1) +"] = "+ arr[j-1]);									
				}
				System.out.println("");
			}
	}

	public static void main(String[] args) {
		
		int[] arr = {80,70,60,50,40};
		System.out.println("Before Sort");
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i] +"\t");
		System.out.println("");
		BubbleSort(arr);
		System.out.println("After Sort");
		for(int i= 0;i<arr.length;i++)
			System.out.println(arr[i]+"\t");
		

	}

}
