package com.problems;

import java.util.ArrayList;


public class SpiralMatrix {

	public static void main(String[] args) {
	
		int[][] array = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

		ArrayList<Integer> listElementasSpiral = new SpiralMatrix().printSpiral(array);
		for(Integer element: listElementasSpiral) {
			System.out.println(element);
		}
	}
	
ArrayList<Integer>printSpiral(int[][] array) {
		
		ArrayList<Integer> spiralList = new ArrayList<Integer>();
		
		int firstRow =0;
		int lastRow = array.length-1;
		int firstCol = 0;
		int lastCol= array[0].length-1;
		
		while (firstRow<lastRow && firstCol < lastCol) {
			
			///up
			for(int i= firstCol;i<=lastCol;i++) {
				spiralList.add(array[firstRow][i]);
			}
			
			for(int i = firstRow+1;i<lastRow;i++) {
				spiralList.add(array[i][lastCol]);
			}
			 for (int i = lastCol-1;i>=firstCol;i--) {
				 spiralList.add(array[lastRow][i]);
			}
			 
			for(int i = lastRow-1; i>firstCol;i--) {
				spiralList.add(array[i][firstCol]);
			}
			 
			
			firstRow++;
			lastRow--;
			firstCol++;
			lastCol--;
		}
		
		return spiralList;
	}

}
