package com.pbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pbs.model.Student;
import com.pbs.repo.StudentRepo;

@RestController
public class StudentController {
	
	@Autowired
	StudentRepo studentRepo;
	
	@PostMapping("add")
	public void addStudent(@RequestBody Student stu) {
		studentRepo.save(stu);
	}
	
	@GetMapping("students")
	public List<Student> getStudents(){
		return studentRepo.getStudents();
	}
	
	@GetMapping("student/{roll}")
	public Student getStudentByRoll(@PathVariable int roll) {
		return studentRepo.getByRoll(roll);
	}
	
	@GetMapping("studentsresult")
	public List<Student> getPassOrFail(@RequestParam Boolean pass){
		if(pass) return studentRepo.getPassStudents();
		return studentRepo.getFailStudents();
	}
	
}
