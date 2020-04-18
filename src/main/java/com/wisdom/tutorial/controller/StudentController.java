package com.wisdom.tutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wisdom.tutorial.model.Student;
import com.wisdom.tutorial.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	StudentService studentService;

	@PostMapping
	public Student save(@RequestBody Student student) {
		try {
			return studentService.save(student);
		} catch (Exception e) {
			return null;
		}
	}

	@GetMapping
	public List<Student> getStudents() {
		try {
			return studentService.getStudents();
		} catch (Exception e) {
			return null;
		}
	}
	
	@PutMapping
	public Student update(@RequestBody Student student) {
		try {
			return studentService.update(student);
		}catch(Exception e) {
			return null;
		}
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") int id) {
		try {
			studentService.delete(id);
		} catch (Exception e) {
			
		}
	}
}
