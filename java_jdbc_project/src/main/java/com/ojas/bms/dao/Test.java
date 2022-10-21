package com.ojas.bms.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Test {
int a=10;
	public static void main(String[] args) {
		try {
			String url="jdbc:mysql://localhost:3306?user=root&password=root";
			Connection con = DriverManager.getConnection(url);
			
			Scanner s = new Scanner(System.in);
			PreparedStatement ps = con.prepareStatement("insert into firstdb.bank_accounts values(?,?,?,?,?)");
			PreparedStatement ps1 = con.prepareStatement("update firstdb.bank_accounts set accountname='ravali' where accountnumber=112365498701");
			System.out.println("enter account number");
			ps.setString(1, s.next());
			System.out.println("enter account name");
			ps.setString(2, s.next());
			System.out.println("enter mobile number");
			ps.setString(3, s.next());
			System.out.println("enter balance");
			ps.setString(4, s.next());
			System.out.println("enter account type");
			ps.setString(5, s.next());
			
			ps.addBatch();
			ps1.addBatch();
			ps.executeBatch();
			
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
