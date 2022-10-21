package com.ojas.bms.dao;

import java.sql.SQLException;

public interface BankDao {
		   public void currentAccount() throws SQLException;
		   public void savingsAccount() throws SQLException;
		   public void searchAccount(String accountNum) throws SQLException;
		   public void viewAllAccounts() throws SQLException;
		   public void updateAccount(String accountNum,boolean choice) throws SQLException;
		   public void deleteAccount(String accountNum) throws SQLException;
		   public void deposit() throws SQLException;
		   public void withdraw() throws SQLException;
		   public void checkBalance() throws SQLException;
		
		   
	}

