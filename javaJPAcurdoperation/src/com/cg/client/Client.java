package com.cg.client;

import com.cg.entity.student;
import com.cg.service.studentService;
import com.cg.service.studentServiceImpl;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		studentService service = new studentServiceImpl();

		student Student = new student();
		
		Student.setId(100);
		Student.setName("Subham");
		service.addStudent(Student);
		System.out.println("Data is added sucessfully");
		// retrieve operation
		Student = service.getStudentById(100);
		System.out.print("ID:"+Student.getId());
		System.out.println(" Name:"+Student.getName());
		
		//update Operation
		Student = service.getStudentById(100);
		Student.setName("Subham Raj Choudhary");
		service.updateStudent(Student);
		System.out.println("Data is udated sucessfully");
		//at this breakpoint, we have updated record added in first section

		Student = service.getStudentById(100);
		System.out.print("ID:"+Student.getId());
		System.out.println(" Name:"+Student.getName());

		//at this breakpoint, record is removed from table
		// Delete Operation
		Student = service.getStudentById(100);
		service.removeStudent(Student);
		System.out.println("Data is deleted sucessfully");
	
	}

}
