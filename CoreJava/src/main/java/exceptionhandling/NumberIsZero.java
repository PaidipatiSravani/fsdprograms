package exceptionhandling;

import java.util.Scanner;

class NumberIsZeroException extends RuntimeException{
	NumberIsZeroException(String msg){
		super(msg);
	}
}
public class NumberIsZero {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int number=s.nextInt();
		int count=0;
		
		if(number==0){
			throw new NumberIsZeroException("number is 0");	
		}
		else{
			for(int i=2;i<number;i++){
				if(number%i==0){
					count++;
				}
			}
			if(count>0)
				System.out.println("number is not a prime");
			else
				System.out.println("number is a prime");
		}

	}

}
