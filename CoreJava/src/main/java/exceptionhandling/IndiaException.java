package exceptionhandling;

import java.util.Scanner;
class InvalidException extends RuntimeException{
}
public class IndiaException {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter data ");
		String data=s.next();
		
		if(data.contains("india")){
			throw new InvalidException();
		}

	}

}
