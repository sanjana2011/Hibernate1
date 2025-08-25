package com.rays.user;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestUserDTO {
	
	public static void main(String[] args) {
		
	UserDTO dto = new UserDTO();
	dto.setId(2);
	dto.setFirstName("ayushi");	
	dto.setLastName("jain");
	dto.setLoginId("ayushijain@gmail.com");
	dto.setPassword("root");
	dto.setDob(new Date());
	dto.setAddress("indore");
   
	SessionFactory sf = new Configuration().configure().buildSessionFactory();
	
      Session session = sf.openSession();
      
      Transaction tx = session.beginTransaction();
      
      session.save(dto);
      
      tx.commit();
      
      session.close();
}
}