package com.ds.hash;

import java.util.ArrayList;
import java.util.HashMap;

public class NumberUnique {
	public static void main(String[] args) {
		int[] array = {1,3,5,5,6,6,7,8,10,10};
		ArrayList<Integer> listNumber = new NumberUnique().getUniqueNumber(array);
		for(Integer number: listNumber) {
			System.out.println(number);
		}
	}

		
		ArrayList<Integer> getUniqueNumber(int[] array){
			ArrayList<Integer> returnNumbers = new ArrayList<>();
			HashMap<Integer,Integer> listOfNumbers = new HashMap<>();
			for(int i=0;i<array.length;i++) {
				if(listOfNumbers.get(array[i])!= null){
					int frequency = listOfNumbers.get(array[i]);
					listOfNumbers.put(array[i],frequency+1);	
				}
				else {
					listOfNumbers.put(array[i],1);
				}
			}
			
			for(int number:listOfNumbers.keySet()) {
				if(listOfNumbers.get(number)==1) {
					returnNumbers.add(number);
				}
			}
			return returnNumbers;
		}
}
