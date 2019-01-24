package com.capgemini.view;

import java.util.Scanner;
import com.capgemini.beans.*;
import com.capgemini.bl.StudentSchedular;

public class Admin {
	static Scanner sc = new Scanner(System.in);
	static StudentSchedular studschedular = new StudentSchedular();
		
	public static void showMenu(){
			
		while(true){
			System.out.println("Press 1 to Add Student");
			System.out.println("Press 2 to Add Course");
			System.out.println("Press 3 to Show Student Details By RollNo");
			System.out.println("Press 4 to Show All Student Details");
			System.out.println("Press 5 to exit");
			System.out.println("Enter your Choice");
			int ch = sc.nextInt();
			switch(ch){
			case 1:addStudent();
				   break;
			case 2:addCourse();
				   break;
			case 3:showStudentDetail();
			       break;
			case 4:showAllStudentDetail();
			       break;
			case 5:System.exit(0);
			       break;
			default:System.out.println("Wrong Input");
			}
		}
		}
	
	public static void addStudent(){
		System.out.println("Enter the Roll Number");
		int rollNo = sc.nextInt();
		System.out.println("Enter the Name");
		String name = sc.next();
		String message=studschedular.addStudent(rollNo, name);
		if(message=="Student added successfully") {
			System.out.println("Student detail is stored sucessfully");
		}
		else {
			System.out.println("This roll number already in use");
		}
	}
	public static void addCourse(){
		System.out.print("Enter roll number to add course : ");
		int rollNo = sc.nextInt();
		System.out.print("In how many courses you want to enroll: ");
		int l = sc.nextInt();
		Course[] course = new Course[l];
		for(int i=0;i<l;i++) {
			course[i] = new Course();
			System.out.print("Enter "+(i+1)+" course id : ");
			int courseId = sc.nextInt();
			System.out.print("Enter "+(i+1)+" course name : ");
			String courseName = sc.next();
			course[i].setCourseId(courseId);
			course[i].setCourseName(courseName);
		}
		
		String msg=studschedular.addCourse(rollNo, course, l);
		if(msg!="Course detail added successfully") {
			System.out.println("You entered invalid roll number");
		}
		else {
			System.out.println("Student course stored successfully");
		}
		
	}
	public static void showStudentDetail(){
		System.out.print("Enter Roll Number to show the details : ");
		int rollNo = sc.nextInt();
		Student student=studschedular.showStudentDetail(rollNo);
		if(student!=null) {
			System.out.println("Roll Number : "+student.getRollNo());
			System.out.println("Student Name : "+student.getName());
			System.out.println("Courses of Student are : ");
			Course[] course=student.getCourse();
			for(int j=0;j<student.getNoOfCourse();j++) {
				System.out.println(course[j].getCourseId()+" "+course[j].getCourseName());
			}
		}
		else {
			System.out.println("You enter a invalid roll number");
		}
		
	}
	public static void showAllStudentDetail(){
		Student[] student = studschedular.showAllStudentDetail();
		for(int i=0;student[i]!=null;i++) {
			System.out.println(("Student Roll Number : "+student[i].getRollNo());
			System.out.println("Student Name : "+student[i].getName());
			Course[] c = student[i].getCourse();
			System.out.println("Student Courses : "+student[i].getRollNo());
			for(int j=0;j<student[i].getNoOfCourse();j++) {
				System.out.println("Id : "+c[j].getCourseId()+" Name: "+c[j].getCourseName());
			}
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showMenu();
	}
	

}
