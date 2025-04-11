package com.Inheritance.prac;

public class Marks extends Student {
	int marks ;
	public Marks(int marks) {
		this.marks = marks ; 
	}
	
	public void displaymarks() {
		System.out.println("Marks : "+marks);
	}

}
