package com.project.serviceImplimentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Entity.Subject;
import com.project.repository.SubjectRepository;
import com.project.service.SubjectService;

@Service
public class SubjectServiceImplementation implements SubjectService {

	
	@Autowired
	private SubjectRepository subjectRepo;
	@Override
	public Subject addSubject(Subject subject) {
		return subjectRepo.save(subject);
		
	}

	@Override
	public List<Subject> getAllSubjects() {
		return subjectRepo.findAll();
	
	}

}
