package javafundementals_assignment;

import java.util.Scanner;

public class ConcatenateStrings {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter first string");
		String str1=s.next();
		
		System.out.println("enter second string");
		String str2=s.next();
		
		System.out.println(str1.toUpperCase()+str2.toLowerCase());
		

	}

}
