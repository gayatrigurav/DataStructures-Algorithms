package com.staircaseProblem;

import java.util.ArrayList;

public class Staircase {

	public int number;
	public ArrayList<Integer> visited = new ArrayList<Integer>();
	
	public Staircase(int number,ArrayList<Integer> visited) {
		this.number = number;
		this.visited.addAll(visited);
		this.visited.add(this.number);
		
		
	}

}
