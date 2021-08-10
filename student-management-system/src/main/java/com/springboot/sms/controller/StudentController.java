package com.springboot.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springboot.sms.service.StudentService;

@Controller
public class StudentController {

	private StudentService studentService;

	
	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	 
	//handler method to handle list student request .. and return model and view
	@GetMapping("/students")
	public String listStudents(Model model) //creating view here model
	{
		model.addAttribute("students",studentService.getAllStudents());
		
		 return "students";
		//The return view name "students.html" is ccreated in template folder of resources ... Springboot will automatically detect all templates under template folder...
		
		
		
	}
	
	
}
