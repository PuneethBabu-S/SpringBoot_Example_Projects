package com.pbs.repo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.pbs.model.Student;

@Repository
public class StudentRepo {
	Map<Integer, Student> students = new HashMap<>();
	
	public void save(Student stu) {
		students.put(stu.getRoll(), stu);
	}
	
	public Student getByRoll(int roll) {
		return students.get(roll);
	}
	
	public List<Student> getStudents(){
		return new ArrayList<>(students.values());
	}
	
	public List<Student> getPassStudents(){
		List<Student> passStudents = new ArrayList<>();
		passStudents = students.entrySet().stream().map(x -> x.getValue())
				.filter(x -> x.getPercentage()>=40).collect(Collectors.toList());
		return passStudents;
	}
	
	public List<Student> getFailStudents(){
		List<Student> failStudents = new ArrayList<>();
		failStudents = students.entrySet().stream().map(x -> x.getValue())
				.filter(x -> x.getPercentage()<40).collect(Collectors.toList());
		return failStudents;
	}
}
