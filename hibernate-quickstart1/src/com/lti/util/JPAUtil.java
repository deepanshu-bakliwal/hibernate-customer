package com.lti.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	public static EntityManagerFactory getEntityManagerFactory() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernate-oracle");
	return emf;}
}
