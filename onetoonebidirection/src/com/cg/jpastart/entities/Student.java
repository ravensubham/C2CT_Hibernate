package com.cg.jpastart.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Students")
public class Student {
public static final long serialVersionUID = 1L;
	
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    private int studentid;
     private String name;
     
     @OneToOne(cascade=CascadeType.ALL)
     private Address address;
     
     
     
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
