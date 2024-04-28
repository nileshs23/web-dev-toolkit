package com.masai.useCase;

import com.masai.dao.AccountDao;

import com.masai.dao.AccountDaoImpl;
import com.masai.model.Account;

public class Demo {
	
	public static void main(String[] args) {
		
		Account acc1 = new Account("Nilesh", 1000);
		
		Account acc2 = new Account("Suresh", 2000);
//		acc2.setAccNo(1);
		
		Account acc3 = new Account("Pritesh", 3000);
		
//		System.out.println(acc);
		AccountDao dao = new  AccountDaoImpl();
		
		dao.createAccount(acc1);
		dao.createAccount(acc2);
		dao.createAccount(acc3);
//		System.out.println();
//		System.out.println(dao.createAccount(acc2));
		
//		System.out.println(dao.deleteAccount(1));
//		System.out.println(dao.findAccount(2));
//		
//		System.out.println(dao.updateAccount(acc3));
		
	}

}
