package com.lti.test;

import org.junit.Test;

import com.lti.dao.CustomerDao;
import com.lti.entity.Customer;

public class CustomerTest {

	@Test
	public void addCustomer() {
		Customer c = new Customer();
		c.setName("Gates");
		c.setEmail("gates@lit.com");
		CustomerDao dao = new CustomerDao();
		dao.store(c);
		
		//add conformation logic
		
	}

}
