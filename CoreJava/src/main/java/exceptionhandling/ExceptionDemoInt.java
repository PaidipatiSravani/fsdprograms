package exceptionhandling;

import java.util.Scanner;
class SmallNumberException extends RuntimeException{
}
class ProperNumberException extends RuntimeException{
}
class GreaterNumberException extends RuntimeException{}
public class ExceptionDemoInt {
public static int fact(int number){
int fact=1;
for(int i=1;i<=number;i++){
	fact=fact*i;
}
return fact;
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int number=s.nextInt();
		
		if(number>0&&number<5){
			try {
				throw new SmallNumberException();
			} catch (Exception e) {
				System.out.println("number is small");
			}
		}
		if(number>5&&number<10){
			try {
				throw new ProperNumberException();
			} catch (Exception e) {
				System.out.println("proper number");
			}
		}
		if(number>10){
			try {
				throw new GreaterNumberException();
			} catch (Exception e) {
				System.out.println("it is a greater number");
			}
		}
		System.out.println("factorial of the given number:"+ExceptionDemoInt.fact(number));

	}

}
