package javafundementals_assignment;

import java.util.Scanner;

public class MiddleName {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter name");
		String name=s.nextLine();
		
		String[] array=name.split(" ");
			System.out.println(array[2]);
			System.out.println(array[0]);
			System.out.println(array[1]);
		

	}

}
