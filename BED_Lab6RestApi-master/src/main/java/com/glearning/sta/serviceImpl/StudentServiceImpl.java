package com.glearning.sta.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.glearning.sta.model.Student;
import com.glearning.sta.repository.StudentRepository;
import com.glearning.sta.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("invalid student id passed"));
	}

	@Override
	public Student updateStudent(Student student, long id) {
		Student existingStudents = studentRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("invalid student id passed"));
		if (existingStudents != null) {
			existingStudents.setFirstName(student.getFirstName());
			existingStudents.setLastName(student.getLastName());
			existingStudents.setCourse(student.getCourse());
			existingStudents.setCountry(student.getCountry());

			return studentRepository.save(existingStudents);
		}
		return null;
	}

	@Override
	public void deleteStudent(Long id) {
		studentRepository.deleteById(id);
	}

}
