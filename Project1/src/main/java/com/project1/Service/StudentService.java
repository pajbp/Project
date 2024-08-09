 package com.project1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.Entity.Student;
import com.project1.Repository.StudentRepo;

@Service
public class StudentService {

	 @Autowired
	    private StudentRepo studentRepository;

	    public Student addStudent(Student student) {
	        return studentRepository.save(student);
	    }

	    public List<Student> getAllStudents() {
	        return studentRepository.findAll();
	    }
	}

