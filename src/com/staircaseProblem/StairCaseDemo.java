package com.staircaseProblem;

import java.util.ArrayList;
import java.util.Stack;



public class StairCaseDemo {



		public static void main(String[] args) {
			
			int step = 4;
			Stack<Staircase> stairStack = new Stack<Staircase>();
			stairStack.add(new Staircase(0,new ArrayList<Integer>()));
			
			while(!stairStack.isEmpty()) {
				Staircase currentStair = stairStack.pop();
				if(currentStair.number==step) {
					System.out.println(currentStair.visited);
					continue;
				}
				
				int oneStair = currentStair.number+1;
				if(oneStair <= step) {
					stairStack.add(new Staircase(oneStair,currentStair.visited));
				}
				
				int twoStair = currentStair.number+2;
				if(twoStair <= step) {
					stairStack.add(new Staircase(twoStair,currentStair.visited));
				}
			}

		}
	}


