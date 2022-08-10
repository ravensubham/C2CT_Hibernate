package com.cg.service;


import com.cg.dao.studentDao;
import com.cg.dao.studentDaoImpl;
import com.cg.entity.student;

public class studentServiceImpl implements studentService{

	private studentDao dao;
	
	public studentServiceImpl()
	{

	dao = new studentDaoImpl();
	}
	
	@Override
	public student getStudentById(int id) {
	student Student = dao.getstudentById(id);
		return Student;
	}
	@Override
	public void addStudent(student Student) {
		// TODO Auto-generated method stub
		dao.addStudent(Student);
		dao.beginTransaction();
		dao.commitTransaction();
	}

	@Override
	public void updateStudent(student Student) {
		// TODO Auto-generated method stub
		dao.updateStudent(Student);
		dao.beginTransaction();
		dao.commitTransaction();
	}

	@Override
	public void removeStudent(student Student) {
		// TODO Auto-generated method stub
		      dao.removeStudent(Student);
		      dao.beginTransaction();
		      dao.commitTransaction();
	}

	

}
