package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {

}
