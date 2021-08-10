package com.springboot.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.sms.entity.Student;
import com.springboot.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);

	
	
	}
		@Autowired
		private StudentRepository studentRepository;
		
		
	public void run(String... args) throws Exception {
			
			Student student1 = new Student("vijay","pandit","pandit@gmail.com");
			studentRepository.save(student1);	
			Student student2 = new Student("Moon","Shah","Moon@gmail.com");
			studentRepository.save(student2);	
			 Student student3 = new Student("Arjun","Pandit","Arjun@gmail.com");
			studentRepository.save(student3);	
			Student student4 = new Student("Anand","Pandit","Anand@gmail.com");
			studentRepository.save(student4);	
		
	} 
}
 