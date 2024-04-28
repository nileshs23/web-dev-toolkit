package com.masai.dao;

import com.masai.model.Account;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AccountDaoImpl implements AccountDao {

	@Override
	public boolean createAccount(Account account) {
		// TODO Auto-generated method stub
		boolean flag =  false;
		
//		System.out.println(Persistence.createEntityManagerFactory("accountUnit"));
		
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("account-Unit");
		EntityManager em =  emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(account);
		flag = true;
		
		em.getTransaction().commit();
		
		em.close();
		
		return flag;
		
	}

	@Override
	public boolean deleteAccount(int accNo) {
		// TODO Auto-generated method stub
		
		boolean flag = false;
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("account-Unit");
		EntityManager em = emf.createEntityManager();
		
		Account acct = em.find(Account.class, accNo);
		
		if(acct != null) {
			em.getTransaction().begin();
			em.remove(acct);
			flag = true;
			em.getTransaction().commit();
		}
		
		
		
		em.close();
		
		
		return flag;
		
	}

	@Override
	public boolean updateAccount(Account account) {
		boolean flag = false;
		
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("account-Unit");
		EntityManager em = emf.createEntityManager();
		
		Account acc = em.find(Account.class, account.getAccNo());
		
		if(acc != null) {
			em.getTransaction().commit();
			
			em.merge(account);
			flag = true;
			
			em.getTransaction().commit();
		}
		
		em.close();
		
		
		return flag;
	}

	@Override
	public Account findAccount(int accNo) {
		
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("account-Unit");
		EntityManager em = emf.createEntityManager();
		
		Account acc = em.find(Account.class, accNo);
		
		return acc;
		
	}

}
