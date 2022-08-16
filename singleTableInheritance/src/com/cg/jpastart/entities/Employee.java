package com.cg.jpastart.entities;

import java.io.Serializable;

import javax.persistence.*;  

@Entity
@Table(name="employee_table")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)  
@DiscriminatorColumn(name="emp_type", discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("EMP")


public class Employee implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	
	private int employeeld;

	private String name;

	private double salary;

	public int getEmployeeld() {
		return employeeld;
	}

	public void setEmployeeld(int employeeld) {
		this.employeeld = employeeld;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	
}
