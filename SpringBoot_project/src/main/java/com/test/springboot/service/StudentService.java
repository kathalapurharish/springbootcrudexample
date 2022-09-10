package com.test.springboot.service;

import java.util.List;
import java.util.Optional;

import com.test.springboot.model.Student;

public interface StudentService {

	public void saveStudent(Student S) ;
	 
	public List<Student> getAll();
	
	public  Optional<Student> getByStudentId(int id);
	
	public void deleteStudent(int id);
	
	public void editStudent(int id);
 
}
