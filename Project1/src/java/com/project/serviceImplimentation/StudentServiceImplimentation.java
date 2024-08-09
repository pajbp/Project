package com.project.serviceImplimentation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Entity.Student;
import com.project.Entity.Subject;
import com.project.Exception.StudentNotFoundException;
import com.project.repository.StudentRepository;
import com.project.repository.SubjectRepository;
import com.project.service.StudentService;

@Service
public class StudentServiceImplimentation implements StudentService {

	@Autowired
	private StudentRepository studentRepo;

	@Autowired
	private SubjectRepository subjectRepo;

	@Override
	public Student addStudent(Student student) {

		return studentRepo.save(student);
	}

	@Override
	public List<Student> getAllStudents() {

		return studentRepo.findAll();
	}

	@Override
	public Student getStudentById(int id) {
		Optional<Student> optional = studentRepo.findById(id);
		if (optional.isPresent()) {

			return optional.get();
		}
		throw new StudentNotFoundException("Student not exist");
	}

	@Override
	public Student updateStudent(int id, Student updatedStudent) {
		Optional<Student> student = studentRepo.findById(id);
		if (student.isPresent()) {
			Student existingStudent = student.get();
			existingStudent.setSname(updatedStudent.getSname());
			existingStudent.setSaddress(updatedStudent.getSaddress());
			return studentRepo.save(existingStudent);
		} else {
			throw new StudentNotFoundException("Student not exist");
		}

	}

	@Override
	public Student addSubjectToStudent(int stuId, int subId) {
		Optional<Student> student = studentRepo.findById(stuId);
		Optional<Subject> subject = subjectRepo.findById(subId);

		if (student.isPresent() && subject.isPresent()) {
			student.get().getSubjects().add(subject.get());
			return studentRepo.save(student.get());
		} else {
			throw new StudentNotFoundException("Student not exist");
		}
	}
}

	
		
	

	

