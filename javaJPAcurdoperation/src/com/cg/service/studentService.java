package com.cg.service;

import com.cg.entity.student;
public interface studentService {
	public abstract void addStudent(student Student);
	public abstract void updateStudent(student Student);
	public abstract void removeStudent(student Student);

	public abstract student getStudentById(int id);
}
