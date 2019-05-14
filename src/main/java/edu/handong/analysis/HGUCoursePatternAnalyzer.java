package edu.handong.analysis;

import edu.handong.analysis.datamodel.Course;

import edu.handong.analysis.datamodel.Student;

import java.util.ArrayList;

public class HGUCoursePatternAnalyzer {
	
	String[] lines = {	"1999-1, JC Nam, Java Programming",
						"1999-2, JC Nam, Programming Language Theory",
						"1999-1, JC Nam, Data Structures",
						"2001-1, JC Nam, Database Systems",
						"2018-1, SB Lim, Java Programming",
						"2018-2, SB Lim, Programming Language Theory",
						"2019-1, SB Lim, Data Structures",
						"2019-1, SB Lim, Algorithm Analysis",
						"2018-1, SJ Kim, Java Programming",
						"2018-2, SJ Kim, Programming Language Theory",
						"2019-1, SJ Kim, Logic Design",
						"2019-1, SJ Kim, Algorithm Analysis",
						};

	int numOfStudents;
	int numOfCourses;
	private ArrayList<Student> students;
	private ArrayList<Course> courses;
	
	/**
	 * This method runs our analysis logic to get the list of student and course names from lines.
	 * @param args
	 */
	public void run(String[] args) {
		
		numOfStudents = Integer.parseInt(args[0]);
		numOfCourses = Integer.parseInt(args[1]);
	
		students = initiateStudentArrayFromLines(lines);
		
		System.out.println("Number of All Students: " + numOfStudents);
		for(Student student: students) {
			
			if(student != null)
			System.out.println(student.getName());
		}
		
		courses = initiateCourseArrayFromLines(lines);
		System.out.println("Number of All Courses: " + numOfCourses);
		for(Course course: courses) {
			if(course != null)
			System.out.println(course.getCourseName());
		}
		
	}

	/**
	 * This method returns a Student array to initiate the field, students, from lines.
	 * @param lines
	 * @return
	 */
	private ArrayList<Student> initiateStudentArrayFromLines(String[] lines) {
		
		
		ArrayList<Student> sList = new ArrayList<Student>();
		
		int j = 0; // i -> out of range
		
		for(int i = 0; i < lines.length; i++) { // not student.length
			
			
			
			if(!studentExist(sList, new Student(lines[i]))) 
			
			sList.add(new Student(lines[i]));
			
		}
		
	
		
		return sList;
	}

	/**
	 * This method check if there is the same name of the second arugement in the array, students
	 * @param students
	 * @param student
	 * @return boolean
	 */
	private boolean studentExist(ArrayList<Student> sList, Student student) {
		
		int size = sList.size();
		
		for(int p = 0 ; p < size ; p ++) {
			if(sList.get(p).getName().equals(student.getName()))
				return true;
		}
		/*for(ArrayList<String> checkStudent: sList.get(i)) {
			
			if( checkStudent != null  ) { //if not, mem err occur
				if(checkStudent.getName().equals(student.getName()))
				
				return true;
			}
			
		}
	*/
		
		return false;

	}
	
	/**
	 * This method returns a Course array to initiate the field, courses, from lines.
	 * @param lines
	 * @return
	 */
	private ArrayList<Course> initiateCourseArrayFromLines(String[] lines) {
		
		
		ArrayList<Course> cList = new ArrayList<Course>();
		int j = 0; // i -> out of range
		
		for(int i = 0; i < lines.length; i++) { // not student.length
			
			
			if(!courseExist(cList, new Course(lines[i]))) 
			
			cList.add(new Course(lines[i]));
			
		}
		
		return cList;
	}

	/**
	 * This method check if there is the same name of the second argument in the array, courses.
	 * @param courses
	 * @param course
	 * @return boolean
	 */
	private boolean courseExist(ArrayList<Course> cList, Course course) {
	
		
		int size = cList.size();
		
		for(int p = 0 ; p < size ; p ++) {
			if(cList.get(p).getCourseName().equals(course.getCourseName()))
				return true;
		}
		
		/*
		for(Course checkCourse: courses) {
			
			if( checkCourse != null  ) { //if not, mem err occur
				if(checkCourse.getCourseName().equals(course.getCourseName()))
				
				return true;
			}
		}
		*/
		
		return false;
	}

}
