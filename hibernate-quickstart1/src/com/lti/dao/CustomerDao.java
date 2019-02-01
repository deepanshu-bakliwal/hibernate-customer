package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.lti.entity.Customer;
import com.lti.util.JPAUtil;

public class CustomerDao {
public void store(Customer customer) {
	//step1 create obtain EntityManagerFactory object
	EntityManagerFactory emf=JPAUtil.getEntityManagerFactory();
	//step2 Create EntityManager Object
	EntityManager em=emf.createEntityManager();
	//step3 Start/participation in a transaction
	EntityTransaction tx=em.getTransaction();
	tx.begin();
	
	//now we can insert/update/delete/select whatever we want
	em.persist(customer);
	tx.commit();
	//should be in finally block
	em.close();
	emf.close();
	
	
}
}
