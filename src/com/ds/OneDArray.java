package com.ds;

public class OneDArray {

	public OneDArray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	    int[] numbers = new int[5];
		numbers[0]=20;
		numbers[1]=5;
		numbers[2]=10;
		numbers[3]=6;
		numbers[4]=11;
		
		for(int i = 0;i<numbers.length;i++)
			System.out.println(numbers[i]);

	// array of objects

	Student [] students = new Student[4];
	students[0]= new Student("tom",27);
	students[1]= new Student("jon",26);
	students[2]= new Student("mon",23);
	students[3]= new Student("don",24);
	for(Student student:students) {
		System.out.println("name:"+student.name+",Age:"+ student.age);
	}
		
	}

}


