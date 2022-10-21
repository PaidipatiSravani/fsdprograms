package com.ojas.bms.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.ojas.bms.menu.BankDetails;

public class BankManagementSystem {

	public static void main(String[] args) throws SQLException {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("-------------------------------");
			System.out.println("|  BANK MANAGEMENT SYSTEM     |");
			System.out.println("-------------------------------");
			System.out.println("|     1. ADMIN                |");
			System.out.println("|     2. CUSTOMER             |");
			System.out.println("|     3. EXIT                 |");
			System.out.println("--------------------------------");
			System.out.println("Enter Your Choice ?");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				BankDetails.adminMainMenu();
				break;
			case 2:
				BankDetails.customerMainMenu();
				break;
			case 3:System.exit(0);
			default:
				System.out.println("enter the range between 1-3 only");
			}

		}

	}

}
