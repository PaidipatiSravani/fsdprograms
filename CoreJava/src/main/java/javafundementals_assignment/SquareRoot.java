package javafundementals_assignment;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int number=s.nextInt();
		double sqNum=Math.sqrt(number);
		System.out.println("square root of the given number:"+sqNum);
	}

}
