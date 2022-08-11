package multithreading_assignment;

import java.util.Scanner;

class Bank{
	int balance=10000;
	boolean type=true;
	public synchronized void deposit(int depAmount){
		balance+=depAmount;
		System.out.println("current balance:"+balance);
		notify();
	}
	
	public synchronized void withdraw(int witAmount){
		if(balance>=witAmount){
			balance-=witAmount;
			System.out.println("current balance after withdrawing"+balance);
		}
		else{
			System.out.println("you have insufficient funds");
			try {
				
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}withdraw(2000);
		}
		
	}
}
public class BankAccountSynchronization {

	public static void main(String[] args) {
		final Bank b=new Bank();
		final Scanner s=new Scanner(System.in);
		Thread t1=new Thread(){
			public void run(){
				System.out.println("enter the money you want to withdraw");
				b.withdraw(3000);
				System.out.println("withdraw completed");
			}
		};
		t1.start();
		
		Thread t2=new Thread(){
			public void run(){
				System.out.println("enter the money you want to deposit");
				b.deposit(4000);
				System.out.println("deposit completed");
			}
		};
		
		t2.start();
		}
	}


