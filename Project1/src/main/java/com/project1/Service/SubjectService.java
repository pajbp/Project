package com.project1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.Entity.Subject;
import com.project1.Repository.SubjectRepo;

@Service
public class SubjectService {
	
	 @Autowired
	    private SubjectRepo subjectRepository;

	    public List<Subject> getAllSubjects() {
	        return subjectRepository.findAll();
	    }
	    
	    public Subject addSubject(Subject subject) {
			return subjectRepository.save(subject);
	    	
	    }
	}


