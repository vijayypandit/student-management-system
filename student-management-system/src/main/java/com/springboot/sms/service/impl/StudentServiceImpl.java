package com.springboot.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.sms.entity.Student;
import com.springboot.sms.repository.StudentRepository;
import com.springboot.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	//constructor based dependancy injection to be used here
	private StudentRepository studentRepository;
	
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	public List<Student> getAllStudents() {

			
		
		return studentRepository.findAll();
	}

	
	
}
