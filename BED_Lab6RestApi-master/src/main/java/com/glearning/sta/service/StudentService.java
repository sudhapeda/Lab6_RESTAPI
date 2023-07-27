package com.glearning.sta.service;

import java.util.List;

import com.glearning.sta.model.Student;


public interface StudentService {
	
	Student createStudent(Student student);

    List<Student> getAllStudents();

    Student getStudentById(Long id);

    Student updateStudent(Student student, long id);

    void deleteStudent(Long id);

}
