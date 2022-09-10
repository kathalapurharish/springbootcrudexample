package com.test.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.springboot.dao.StudentRepository;
import com.test.springboot.model.Student;

@Service
@Transactional
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository repo;

	@Override
	public void saveStudent(Student s) {
		repo.save(s);
	}

	@Override
	public List<Student> getAll() {
	
		return repo.findAll();
	}

	@Override
	public void deleteStudent(int id) {
		repo.deleteById(id);
		
	}

	@Override
	public Optional<Student> getByStudentId(int id) {
		return repo.findById(id);
	}

	@Override
	public void editStudent(int id) {
		repo.findById(id);
		
	}

	}

	
	
