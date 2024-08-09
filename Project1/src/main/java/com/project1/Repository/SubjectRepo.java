package com.project1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project1.Entity.Subject;
@Repository
public interface SubjectRepo extends JpaRepository<Subject, Integer>{

}
