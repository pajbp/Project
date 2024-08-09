package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.Entity.Subject;
import com.project.repository.SubjectRepository;
import com.project.service.SubjectService;

@RestController
public class SubjectController {

	
	@Autowired
	private SubjectService subjectService;
	
	@PostMapping
	public ResponseEntity<Subject> addSubject(@RequestBody Subject subject) {
		System.out.println("New Subject Added: " + subject);
		subjectService.addSubject(subject);
		return new ResponseEntity<Subject>(HttpStatus.OK);
}
	@GetMapping(value = "/subjects")
	public ResponseEntity<List<Subject>> getAllSubjects() {
		System.out.println("Fetching All Subjects: ");
		subjectService.getAllSubjects();

		return new ResponseEntity<List<Subject>>(HttpStatus.OK);

	}

}
