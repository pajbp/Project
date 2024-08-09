package com.project.service;

import java.util.List;

import com.project.Entity.Student;
import com.project.Entity.Subject;

public interface StudentService {

	Student addStudent(Student student);
	
	

	List<Student> getAllStudents();

	Student getStudentById(int id);

	Student updateStudent(int id, Student updatedStudent);

	Student addSubjectToStudent(int stuId, int SubId);

	


}
