package edu.handong.analysis.datamodel;

public class Course {
	
	private String courseName;

	
	public Course(String Name){
		
		courseName = Name.split(",")[2].trim();
		
	}

	public String getCourseName() {
		
		return courseName;		
	}
}
