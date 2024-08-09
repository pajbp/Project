package com.project1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project1.Entity.Student;
import com.project1.Service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping(value = "/addStudent")
	public ResponseEntity<Student> addStudent(@RequestBody Student student) {
		System.out.println("Add new Student: " + student);
		studentService.addStudent(student);
		return new ResponseEntity<Student>(HttpStatus.OK);
	}

	@GetMapping(value = "getAllStudents")
	public ResponseEntity<List<Student>> getAllStudent() {
		System.out.println("Fetching Student Data: ");
		studentService.getAllStudents();
		return new ResponseEntity<List<Student>>(HttpStatus.OK);
	}

}
