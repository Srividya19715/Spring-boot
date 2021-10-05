package com.mentor.mindtree.vidya.Entity;

public class CollegeStudents {
	private int rollno;
	private String name;
	private char gender;
	private float marks;

	public CollegeStudents(int rollno, String name, char gender, float marks) {
		this.rollno = rollno;
		this.name = name;
		this.gender = gender;
		this.marks = marks;
	}

	public CollegeStudents() {
		
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

}
