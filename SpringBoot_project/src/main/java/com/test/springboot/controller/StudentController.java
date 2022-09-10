package com.test.springboot.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.test.springboot.model.Student;
import com.test.springboot.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService service;

	@RequestMapping("/addstudentform")
	public String addStudent(Student student) {
		System.out.println("studentform.jsp...");

		return "studentform";
	}

	@RequestMapping("/saveStudent")
	public String saveStudent(@ModelAttribute Student student) {
		System.out.println("springboot..." + student.getBranch());
		service.saveStudent(student);

		return "redirect:/listStudent";

	}

	@RequestMapping("/listStudent")
	public ModelAndView getAll(ModelAndView model) {
		List<Student> listStudent = service.getAll();
		System.out.println("list of all students...");
		model.addObject("listStudent", listStudent);
		model.setViewName("home");
		return model;
	}
	@RequestMapping("/deleteStudent")
	public String deleteStudent(HttpServletRequest request) {
		
		int studentId = Integer.parseInt(request.getParameter("id"));
		
		
		service.deleteStudent(studentId);
		return"redirect:/listStudent";
	}
	@RequestMapping("/editStudent")
	public ModelAndView editStudent(HttpServletRequest request) {
		int studentId = Integer.parseInt(request.getParameter("id"));
		Optional<Student> student = service.getByStudentId(studentId);
		 ModelAndView model = new ModelAndView("studentform");
		 model.addObject("student", student);
		return model;
	}

}
