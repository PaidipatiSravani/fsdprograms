package exceptionhandling;

import java.util.Scanner;
class MarksOutOfBoundsException extends RuntimeException{
	MarksOutOfBoundsException(){
		super();
	}
}
public class MarksOutOfBounds {
public int marks;
	public static void main(String[] args) {
		MarksOutOfBounds obj=new MarksOutOfBounds();
		System.out.println("enter marks");
		Scanner s=new Scanner(System.in);
		obj.marks=s.nextInt();
		
		if(obj.marks>100){
			throw new MarksOutOfBoundsException();
		}

	}

}
