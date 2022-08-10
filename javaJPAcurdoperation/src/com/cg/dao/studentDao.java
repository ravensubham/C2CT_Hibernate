package com.cg.dao;

import com.cg.entity.student;

public interface studentDao {

	public abstract student getstudentById(int id);
	public abstract void addStudent(student Student);
	public abstract void removeStudent(student Student);
	public abstract void updateStudent(student Student);

	public abstract void commitTransaction();
	public abstract void beginTransaction();
}
