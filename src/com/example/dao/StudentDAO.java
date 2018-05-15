
package com.example.dao;

import java.util.ArrayList;
import java.util.List;

import com.example.bean.Student;

public class StudentDAO {

	// create an arraylist which will store the student information
	List<Student> studentlist = new ArrayList<Student>();

	// Business logic
	public List<Student> addStudent(Student stud) {
		studentlist.add(stud);
		System.out.println(studentlist);
		return studentlist;
	}

}
