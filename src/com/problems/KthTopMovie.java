package com.problems;

import java.util.PriorityQueue;

public class KthTopMovie {

	public static void main(String[] args) {
int [] streamRating = {3,4,5,2,4,5,1,1,2};
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		int k = 3; // if we want top2 movie then take K=2 
		
		//streaming 
		for(int i=0;i<streamRating.length;i++) {
			pq.add(streamRating[i]);
			if(pq.size() > k) {
				pq.poll();
			}
			
			System.out.println(pq.toString());
			
		}
		
		System.out.println(pq.toString());

	}

	

}
