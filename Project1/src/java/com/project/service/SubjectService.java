package com.project.service;

import java.util.List;

import com.project.Entity.Subject;

public interface SubjectService {
	
	Subject addSubject(Subject subject);
	
	List<Subject> getAllSubjects();

}
