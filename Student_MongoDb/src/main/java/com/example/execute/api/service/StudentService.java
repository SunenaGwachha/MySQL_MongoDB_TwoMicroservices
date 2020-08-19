package com.example.execute.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.execute.api.model.Student;


public interface StudentService {

	Student addStudent(Student student);

	List<Student> getStudent();

}
