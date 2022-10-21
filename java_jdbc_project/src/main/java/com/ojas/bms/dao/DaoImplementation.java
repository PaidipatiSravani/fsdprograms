

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.regex.Pattern;
class AccountNotFoundException extends RuntimeException{
	AccountNotFoundException(){
		super();
	}
}


public class DaoImplementation  implements BankDao {
	
   

	String url = "jdbc:mysql://localhost:3306?user=root&password=root";
	String query = "insert into firstdb.bank_accounts values(?,?,?,?,?)";

	Connection con;
	PreparedStatement ps;

	Scanner s = new Scanner(System.in);

	public void currentAccount() {
		int n = 1;
		while (n == 1) {

			try {

				con = DriverManager.getConnection(url);
				ps = con.prepareStatement(query);

				System.out.println("your account type is:current account");

				System.out.println("enter account number");
				String accountNo = s.next();
				while (!Pattern.matches("[1]{2}[0-9]{10}", accountNo)) {
					System.out.println("enter valid account number");
					accountNo = s.next();
				}

				ps.setString(1, accountNo);

				System.out.println("enter account name");
				String name = s.next();
				while (!Pattern.matches("[A-Z][a-z]*", name)) {
					System.out.println("enter characters only with first character as capital letter");
					name = s.next();
				}

				ps.setString(2, name);

				System.out.println("enter mobile number");
				String number = s.next();
				while (!Pattern.matches("[9876][0-9]{9}", number)) {
					System.out.println("Please enter valid mobile number with 10-digits");
					number = s.next();
				}

				ps.setString(3, number);

				System.out.println("enter balance");
				String balance = s.next();

				ps.setString(4, balance);

				ps.setString(5, "current");

				System.out.println("Do you want to add more accounts press 1 else any number");
				n = s.nextInt();
				ps.executeUpdate();

				System.out.println("account added successfully");
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}

	public void savingsAccount() {
		int n = 1;
		while (n == 1) {
			try {
				con = DriverManager.getConnection(url);
				ps = con.prepareStatement(query);

				System.out.println("your account type is:savings account");

				System.out.println("enter account number");
				String accountNo = s.next();
				while (!Pattern.matches("[1]{2}[0-9]{10}", accountNo)) {
					System.out.println("enter valid account number");
					accountNo = s.next();
				}

				ps.setString(1, accountNo);

				System.out.println("enter account name");
				String name = s.next();
				while (!Pattern.matches("[A-Z][a-z]*", name)) {
					System.out.println("enter characters only with first character as capital letter");
					name = s.next();
				}
				ps.setString(2, name);
				System.out.println("enter mobile number");
				String number = s.next();
				while (!Pattern.matches("[9876][0-9]{9}", number)) {
					System.out.println("Please enter valid mobile number with 10-digits");
					number = s.next();
				}
				ps.setString(3, number);

				System.out.println("enter balance");
				String balance = s.next();

				ps.setString(4, balance);

				ps.setString(5, "savings");

				System.out.println("Do you want to add more accounts press 1 else any number");
				n = s.nextInt();
				
				ps.executeUpdate();

				System.out.println("account added successfully");
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void searchAccount(String accountNum) {

		String query_search = "select * from firstdb.bank_accounts where accountNumber=?";

		try {
			con = DriverManager.getConnection(url);
			ps = con.prepareStatement(query_search);

			ps.setString(1, accountNum);

			ResultSet rs = ps.executeQuery();
				if(rs.next()){
				while (rs.next()) {
					String acc_num = rs.getString("accountNumber");
					String acc_name = rs.getString("accountName");
					String mobile = rs.getString("mobileNumber");
					String balance = rs.getString("balance");
					
					System.out.println("Account details:" + "\n" + "accountnumber:" + acc_num + "\n" + "account name:"
							+ acc_name + "\n" + "mobilenumber" + mobile + "\n" + "balance:" + balance);
				}}
				else{
					System.out.println("please check the account number you have entered");
				}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void viewAllAccounts() throws SQLException {

		String query_search = "select * from firstdb.bank_accounts";

		con = DriverManager.getConnection(url);
		ps = con.prepareStatement(query_search);

		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			String acc_num = rs.getString("accountNumber");
			String acc_name = rs.getString("accountName");
			String mobile = rs.getString("mobileNumber");
			String balance = rs.getString("balance");

//			System.out.println(   acc_num + "\t\t" 
//					+ acc_name + "\t\t\t"   + mobile + "\t\t\t" + balance);
//			System.out.println("-----------------------------------------------------------------------------");
			
			//Formatter fmt = new Formatter();  
			System.out.format("%15s %15s %15s %15s\n",acc_num , acc_name, mobile,balance);  
		}
	}

	public void updateAccount(String accountNum, boolean choice) throws SQLException {
		con = DriverManager.getConnection(url);
		if (choice) {
			ps = con.prepareStatement("update firstdb.bank_accounts set AccountName=? where AccountNumber=? ");
			System.out.println("enter name");
			String name = s.next();
			ps.setString(1, name);
			ps.setString(2, accountNum);
			ps.executeUpdate();
		} else {
			ps = con.prepareStatement("update firstdb.bank_accounts set mobileNumber=? where AccountNumber=? ");
			System.out.println("enter mobile number");
			String mobile = s.next();
			ps.setString(1, mobile);
			ps.setString(2, accountNum);
			ps.executeUpdate();
		}
		con.close();
	}

	public void deleteAccount(String accountNum) throws SQLException{
		String quer_sel="select AccountNumber from firstdb.bank_accounts";
		String query_del = "delete from firstdb.bank_accounts where AccountNumber=?";
		boolean value=true;
		try {
			con = DriverManager.getConnection(url);
			ps = con.prepareStatement(query_del);
			
			PreparedStatement ps1=con.prepareStatement(quer_sel);
			ResultSet rs=ps1.executeQuery();
			while(rs.next()){
				String accountNo=rs.getString(1);
				if(accountNo.equals(accountNum)){
					
					ps.setString(1, accountNum);
					
					ps.executeUpdate();
					System.out.println("account deleted successfully");
					value=false;
				}
			}
			if(value){
				try {
					throw new AccountNotFoundException();
				} catch (Exception e) {
					System.out.println("check the account number you have entered");
					 
				}
				
			}
           


			con.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

		
			}
		
	

	public void deposit() {
		String query_depbal = "update firstdb.bank_accounts set balance=balance+? where AccountNumber=?";
		try {
			con = DriverManager.getConnection(url);
			ps = con.prepareStatement(query_depbal);

			System.out.println("enter the account number");
			String num = s.next();

			ps.setString(2, num);

			System.out.println("enter the amount you want to deposit");
			String dep_amount = s.next();

			ps.setString(1, dep_amount);

			ps.executeUpdate();

			System.out.println("amount deposited successfully");

			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void withdraw() {
		String query_widbal = "update firstdb.bank_accounts set balance=balance-? where AccountNumber=?";
		try {
			con = DriverManager.getConnection(url);
			ps = con.prepareStatement(query_widbal);

			System.out.println("enter the account number");
			String num = s.next();

			ps.setString(2, num);

			System.out.println("enter the amount you want to withdraw");
			String wid_amount = s.next();

			ps.setString(1, wid_amount);

			ps.executeUpdate();

			System.out.println("amount withdrawed successfully");

			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void checkBalance() {
		String query_balance = "select accountNumber,balance from firstdb.bank_accounts where accountNumber=?";
		try {
			con = DriverManager.getConnection(url);
			ps = con.prepareStatement(query_balance);

			System.out.println("enter account number");
			String accountNum = s.next();

			ps.setString(1, accountNum);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				String accountNo = rs.getString("accountNumber");
				String balance = rs.getString("Balance");

				System.out.println("account number is:" + accountNo + " and available balance is:" + balance);

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

}
