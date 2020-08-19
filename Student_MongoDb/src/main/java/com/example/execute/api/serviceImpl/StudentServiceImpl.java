package com.example.execute.api.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.execute.api.model.Student;
import com.example.execute.api.repository.StudentRepository;
import com.example.execute.api.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepository studentRepository;

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getStudent() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

}