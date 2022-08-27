package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	
	public static void main(String[] args) {
	
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU"); 
	EntityManager em = factory.createEntityManager();
    
	em.getTransaction().begin();

	Student student = new Student();

	student.setName("subham");

	
	Address homeAddress = new Address(); 
	homeAddress.setStreet ("karkarbagh Road");

	homeAddress.setCity("patna");

	homeAddress.setState("Bihar"); 
	homeAddress.setZipCode("800 026");


	em.persist(student);

	em.getTransaction().commit();

	em.close(); 
	factory.close();
	
	}
	
}
