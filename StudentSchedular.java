package com.capgemini.bl;

import com.capgemini.beans.Student;
import com.capgemini.beans.Course;

public class StudentSchedular {
	private Student[] student = new Student[10];
	private int counterStud;
	
	public String addStudent(int rollNo, String name){
		int flag=0;
		for(int i=0;i<counterStud;i++){
			if(student[i].getRollNo()==rollNo){
				flag=1;
				break;
			}
		}
		if(flag==1){
			return "Student already exist";	
		}
		else{
			student[counterStud]= new Student();
			student[counterStud].setRollNo(rollNo);
			student[counterStud].setName(name);
			counterStud++;
		}
		return "Student added successfully";
	}
	
	
	public Student showStudentDetail(int rollNo){
		
		for(int i=0;i<counterStud;i++) {
			if(student[i].getRollNo()==rollNo) {
				return student[i];
			}
		}
		return null;
		
	}
	
	public Student[] showAllStudentDetail(){
		
		return student;
		}
	
	public String addCourse(int rollNo,Course[] course,int l){
		
		for(int i=0;i<counterStud;i++){
			if(student[i].getRollNo()==rollNo){
				int len = l + student[i].getNoOfCourse();
				Course[] c = new Course[len];
				Course[] t = student[i].getCourse();
				int j;
				for(j=0;j<student[i].getNoOfCourse();j++){
					c[j] = new Course();
					c[j].setCourseId(t[j].getCourseId());
					c[j].setCourseName(t[j].getCourseName());
				}
				int k=0;
				for(j=0;j<len;j++) {
					c[j] = new Course();
					c[j].setCourseId(course[k].getCourseId());
					c[j].setCourseName(course[k].getCourseName());
					k++;
				}
				student[i].setCourse(c);
				student[i].setNoOfCourse(len);
				return "Course detail added successfully";
			}
		}
		
		return "No";
		}
			
}
		

