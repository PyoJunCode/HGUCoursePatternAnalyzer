package edu.handong.analysis.datamodel;

public class Student {
	
	private String name;

	
	public Student(String name) {
		this.name = name.split(",")[1].trim();
	}
	
	public String getName() {
		return name;
	}

}
