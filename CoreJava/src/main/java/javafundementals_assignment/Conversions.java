package javafundementals_assignment;

public class Conversions {

	public static void main(String[] args) {
		String string="10";
		        //string to decimal
		int number=Integer.parseInt(string);
		System.out.println(number);
		        //decimal to binary
		System.out.println(Integer.toBinaryString(number));
		        //decimal to hexa
		System.out.println(Integer.toHexString(number));
		
		
	}

}
