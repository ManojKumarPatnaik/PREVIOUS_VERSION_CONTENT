package com.epam.pmt.interfaceimplemetation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.epam.pmt.entity.Account;

public class CreateAccountDetails {
	public static EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("my-mysql-unit");
	public static EntityManager emanager=emFactory.createEntityManager();
	
//	 AccountDataBase data;
	public void add(Account account) {
		
		System.out.println(account);
		emanager.getTransaction().begin();
		emanager.persist(account);
		emanager.getTransaction().commit();
		
		
		
//		data.add(account);
//		return true;
		
	}
	

}
