package com.masai.dao;

import com.masai.model.Account;

public interface AccountDao {
	
	public boolean createAccount(Account account);
	
	public boolean deleteAccount(int accNo);
	
	public boolean updateAccount(Account account);
	
	public Account findAccount(int accNo);

}
