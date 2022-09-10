package com.test.springboot.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Student_123")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {

	@Id
	private int id;
	private String name;
	private int rollno;
	private String branch;
	private String address;
	
}
