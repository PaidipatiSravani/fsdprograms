package exceptionhandling;

import java.util.Scanner;
class TooSmallStringException extends RuntimeException{
}
class ProperStringException extends RuntimeException{
}
public class StringLength {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the name");
		String name=s.next();
		
		if(name.length()>0&&name.length()<5){
			throw new TooSmallStringException();
		}
		if(name.length()>5&&name.length()<10){
			throw new ProperStringException();
		}

	}

}
