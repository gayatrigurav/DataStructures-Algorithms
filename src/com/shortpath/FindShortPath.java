package com.shortpath;

import java.util.LinkedList;
import java.util.Queue;

public class FindShortPath {

	public static void main(String[] args) {
		// 9 is post location
		int[][] grid = {{1,1,1,1,0},{0,0,0,1,0},{0,0,1,1,0},{0,0,1,9,0}};
		print(grid);
		Queue<Cell> queue = new LinkedList<Cell>();
		// set robot location
		move(grid,queue,0,0,0);
		
		while(!queue.isEmpty()) {
			Cell botCell = queue.poll();
			
			move(grid,queue,botCell.rowIndex-1,botCell.colIndex,botCell.distance+1); //left
			move(grid,queue,botCell.rowIndex +1,botCell.colIndex,botCell.distance+1); //right
			move(grid,queue,botCell.rowIndex,botCell.colIndex-1,botCell.distance+1);//top
			move(grid,queue,botCell.rowIndex,botCell.colIndex+1,botCell.distance+1); //down
		}
		
	}

	static void move(int[][] grid,Queue<Cell>queue, int newRow, int newCol, int newDistance ) {
		//make sure the robot in the grid
		if(newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol <grid[0].length) {
			if(grid[newRow][newCol] == 1) {
				Cell c = new Cell(newRow,newCol,newDistance);
				queue.add(c);
				grid[newRow][newCol] = -1; // cell is visited
			}else if(grid[newRow][newCol] == 9) {
				//path is found
				System.out.println("Path is found,Distance:" + newDistance);
				System.exit(0);
			}
		}
	}
	
	static void print(int[][] grid) {
		for(int i = 0; i<grid.length;i++) {
			for(int j =0;j<grid[0].length;j++) {
				System.out.print(grid[i][j] + "");
			}
			System.out.println("");
		}
	}
}
