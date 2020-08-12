package com.shortpath;

public class Cell {

	public int rowIndex;
	public int colIndex;
	public int distance;
	
	public Cell(int newRow, int newCol, int newDistance) {
		this.rowIndex = newRow;
		this.colIndex = newCol;
		this.distance = newDistance;
	}
}
