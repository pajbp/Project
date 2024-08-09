package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.Entity.Student;
import com.project.Entity.Subject;
import com.project.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping(value = "/addStudent")
	public ResponseEntity<Student> addStudent(@RequestBody Student student) {
		System.out.println("New Student Added: " + student);
		studentService.addStudent(student);
		return new ResponseEntity<Student>(HttpStatus.OK);
	}

	

	

	@GetMapping(value = "/getAllStudents")
	public ResponseEntity<List<Student>> getAllStudent() {
		System.out.println("Fetching All Student Data:");
		List<Student> sname = studentService.getAllStudents();
		return new ResponseEntity<List<Student>>(sname, HttpStatus.OK);

	}

	@GetMapping(value = "/getStudent/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable int id) {
		System.out.println("Check Student: " + id);
		studentService.getStudentById(id);
		return new ResponseEntity<Student>(HttpStatus.OK);
	}

	@PutMapping(value = "/updateStudent")
	public ResponseEntity<Student> updateStudent(@PathVariable int id, @PathVariable Student updatedStudent) {
		System.out.println("Update Student Data: " + id + " " + updatedStudent);
		studentService.updateStudent(id, updatedStudent);
		return new ResponseEntity<Student>(HttpStatus.OK);
	}

	@PostMapping(value = "/subjects/{stuId}/{subId}")
	public ResponseEntity<Student> addSubjectToStudent(@PathVariable int stuId, @PathVariable int SubId) {
		System.out.println("Add Subject Data to Student: " + stuId + " " + SubId);
		studentService.addSubjectToStudent(stuId, SubId);
		return new ResponseEntity<Student>(HttpStatus.OK);
	}

	
	
}
