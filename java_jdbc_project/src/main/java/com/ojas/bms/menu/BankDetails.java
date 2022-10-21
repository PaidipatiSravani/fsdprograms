package com.ojas.bms.menu;

import java.sql.SQLException;
import java.util.Scanner;

import com.ojas.bms.main.BankManagementSystem;
import com.ojas.bms.dao.*;

public class BankDetails {

	static DaoImplementation dao = new DaoImplementation();

	public static void adminMainMenu() throws SQLException {

		System.out.println("-----------------------");
		System.out.println("1.ADD ACCOUNT          ");
		System.out.println("2.SEARCH ACCOUNT       ");
		System.out.println("3.VIEW ALL ACCOUNTS    ");
		System.out.println("4.UPDATE ACCOUNT       ");
		System.out.println("5.DELETE ACCOUNT       ");
		System.out.println("6.BACK                 ");
		System.out.println("-----------------------");
		System.out.println("enter your choice");
		Scanner s = new Scanner(System.in);
		int choice = s.nextInt();
		switch (choice) {
		case 1:
			System.out.println("enter your choice");
			System.out.println("-----------------");
			System.out.println("1.CURRENT ACCOUNT");
			System.out.println("2.SAVINGS ACCOUNT");
			System.out.println("3.BACK           ");
			System.out.println("-----------------");
			int choice1 = s.nextInt();
			switch (choice1) {
			case 1:
				dao.currentAccount();
				adminMainMenu();
				break;
			case 2:
				dao.savingsAccount();
				adminMainMenu();
				break;
			default:
				System.out.println("enter valid number");
				break;
			}
		case 2:
			System.out.println("enter the account number");
			dao.searchAccount(s.next());
			adminMainMenu();
			break;
		case 3:
			System.out.println("--------------------------------------------------------------");
			System.out.format("%15s %15s %15s %15s\n","ACCNUM"  , "ACCNAME", "MOBNUM","BALANCE");
			System.out.println("--------------------------------------------------------------");
			dao.viewAllAccounts();
			adminMainMenu();
			break;
		case 4:
			boolean value = true;
			System.out.println("enter the account number ");
			String accountNum = s.next();
			while (value) {
				System.out.println("-------------------------");
				System.out.println("WHAT YOU WANT TO UPDATE  ");
				System.out.println("1.NAME                   ");
				System.out.println("2.MOBILE NUMBER          ");
				System.out.println("3.BACK                   ");
				System.out.println("-------------------------");
				int ch = s.nextInt();
				switch (ch) {
				case 1:
					dao.updateAccount(accountNum, true);
					break;
				case 2:
					dao.updateAccount(accountNum, false);
					break;
				case 3:
					value = false;
					adminMainMenu();
					break;
				default:
					System.out.println("enter the numbers within 1-3 range only");

				}
			}

		case 5:
			System.out.println("enter the account number");
			dao.deleteAccount(s.next());
			adminMainMenu();
			break;
		case 6:
			BankManagementSystem.main(null);
			break;
		default:
			System.out.println("enter the numbers within 1-6 range only");
		}

	}

	public static void customerMainMenu() throws SQLException {
		System.out.println("-----------------------");
		System.out.println("1.DEPOSIT              ");
		System.out.println("2.WITHDRAW             ");
		System.out.println("3.CHECK BALANCE        ");
		System.out.println("4.BACK                 ");
		System.out.println("-----------------------");
		System.out.println("enter your choice");
		Scanner s = new Scanner(System.in);
		int choice = s.nextInt();
		switch (choice) {
		case 1:
			dao.deposit();
			customerMainMenu();
			break;
		case 2:
			dao.withdraw();
			customerMainMenu();
			break;
		case 3:
			dao.checkBalance();
			customerMainMenu();
			break;
		case 4:
			BankManagementSystem.main(null);
			break;
		default:
			System.out.println("enter valid number between 1-4 only");

		}
	}
}
