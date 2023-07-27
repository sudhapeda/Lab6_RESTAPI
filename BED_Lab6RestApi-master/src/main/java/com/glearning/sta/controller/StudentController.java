package com.glearning.sta.controller;

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

import com.glearning.sta.model.Student;
import com.glearning.sta.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping
	public List<Student> viewAllStudents() {
		return studentService.getAllStudents();
	}

	@GetMapping("/{id}")
	public Student getStudentById(@PathVariable long id) {
		return studentService.getStudentById(id);
	}

	@PostMapping
	public Student createStudents(@RequestBody Student student) {
		return studentService.createStudent(student);
	}

	@PutMapping("/{id}")
	public Student updateStudent(@RequestBody Student student, @PathVariable long id) {
		return studentService.updateStudent(student, id);
	}

	@DeleteMapping("/{id}")
	public void deleteStudentById(@PathVariable long id) {
		studentService.deleteStudent(id);
	}

}
