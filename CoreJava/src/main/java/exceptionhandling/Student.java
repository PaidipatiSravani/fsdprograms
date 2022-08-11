package exceptionhandling;

import java.util.Scanner;
import java.util.regex.Pattern;
class AgeNotWithinRangeException extends RuntimeException{
	AgeNotWithinRangeException(String msg){
		super(msg);
	}
}
class NameInvalidException extends RuntimeException{
	NameInvalidException(String msg){
		super(msg);
	}
}
public class Student {
public int rollNo;
public String name;
public int age;
public String course;

	public Student(int rollNo, String name, int age, String course) {
	this.rollNo = rollNo;
	this.name = name;
	this.age = age;
	this.course = course;
}

	public static void main(String[] args) {
//		System.out.println("enter name");
//		Scanner s= new Scanner(System.in);
//		String name=s.next();
//		
//		System.out.println("enter age");
//		int age=s.nextInt();
		
		//Student obj=new Student(123,name,age,"ece");
		Student obj=new Student(123,"sravani",15,"ece");
		
		if(obj.age<15||obj.age>21){
			throw new AgeNotWithinRangeException("enter age between 15-21");
		}
		if(!Pattern.matches("[a-z]*", obj.name)){
			throw new NameInvalidException("enter valid name");
		}

	}

}
