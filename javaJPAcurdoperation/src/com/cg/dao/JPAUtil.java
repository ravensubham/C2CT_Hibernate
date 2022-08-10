package com.cg.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class JPAUtil {
	private static EntityManagerFactory factory;
	private static EntityManager Manager;
	
	static
	{
	factory = Persistence.createEntityManagerFactory("JPA-PU");
	}
	
	public static EntityManager getEntityManager() {
		if(Manager==null || !Manager.isOpen()) {
			Manager = factory.createEntityManager();
			}
			return Manager;
	}
	
}

