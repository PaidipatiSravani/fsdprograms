package exceptionhandling;

import java.util.regex.Pattern;

class BalanceWithinRangeException extends RuntimeException{
	BalanceWithinRangeException(String msg){
		super(msg);
	}
}
class NamenotValidException extends RuntimeException{
	
}
public class Account {
public int accountNo;
public String name;
public int balance;

public Account(int accountNo, String name, int balance) {
    this.accountNo = accountNo;
	this.name = name;
	this.balance = balance;
}

	public static void main(String[] args) {
		Account obj=new Account(12345,"sravani123",10000);
		
		if(obj.balance>1000&&obj.balance<5000){
			throw new BalanceWithinRangeException("balance is within range");
		}
		if(!Pattern.matches("[a-z]*", obj.name)){
			throw new NamenotValidException();
		}
	}

}
