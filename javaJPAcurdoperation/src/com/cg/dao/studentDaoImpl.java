package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.entity.student;

public class studentDaoImpl implements studentDao{

	
	private EntityManager Manager;
	
	public studentDaoImpl() {
		 Manager = JPAUtil.getEntityManager();
		
		}
	@Override
	public student getstudentById(int id) {
		student Student =	Manager.find(student.class, id);
		return Student;
	}

	@Override
	public void addStudent(student Student) {
		// TODO Auto-generated method stub
		Manager.persist(Student);
	}

	@Override
	public void removeStudent(student Student) {
		// TODO Auto-generated method stub
		Manager.remove(Student);
	}

	@Override
	public void updateStudent(student Student) {
		// TODO Auto-generated method stub
		Manager.merge(Student);
	}
	@Override
	public void commitTransaction() {
		// TODO Auto-generated method stub
		Manager.getTransaction().commit();
	}
	@Override
	public void beginTransaction() {
		// TODO Auto-generated method stub
		Manager.getTransaction().begin();
	}
	

}
