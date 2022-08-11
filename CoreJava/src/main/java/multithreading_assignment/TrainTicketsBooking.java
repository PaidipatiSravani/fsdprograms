package multithreading_assignment;

import java.util.Scanner;

public class TrainTicketsBooking {
int total=50;
	public synchronized void bookTickets(int ticket){
		Scanner sc=new Scanner(System.in);
		if(total>=ticket){
		total-=ticket;
		System.out.println("tickets booked successfully");
		System.out.println("total tickets remaining:"+total);
		}
		else
		{
			System.out.println("wait until someone cancels the ticket");
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			int number=sc.nextInt();
			bookTickets(number);
		}
	}
		public synchronized void cancel(int cancelTicket){
			total+=cancelTicket;
			System.out.println("cancelled successfully");
			System.out.println("total tickets available:"+total);
			
			notify();
			
		}
		
	
	public static void main(String[] args) {
		System.out.println("enter the no. of tickets you want to book");
		
		final TrainTicketsBooking ttb=new TrainTicketsBooking();
		Thread t1=new Thread(){
			public void run(){
				 Scanner s=new Scanner(System.in);
				int number=s.nextInt();
				ttb.bookTickets(number);
			}
		};
		t1.start();
		
		Thread t2=new Thread(){
			public void run(){
				 Scanner s=new Scanner(System.in);
				int number1=s.nextInt();
				ttb.cancel(number1);
			}
		};
		
		t2.start();

	}

}
