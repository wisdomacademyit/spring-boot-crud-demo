package com.wisdom.tutorial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wisdom.tutorial.model.Student;
import com.wisdom.tutorial.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	public Student save(Student student) throws Exception{
		return studentRepository.save(student);
	}
	
	public List<Student> getStudents() throws Exception{
		return studentRepository.findAll();
	}
	
}
