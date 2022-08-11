package javafundementals_assignment;

public class Substring {

	public static void main(String[] args) {
		String data1=args[0];
		String data2=args[1];
		
		if(data1.contains(data2)){
			System.out.println(data2+"is the substring of"+data1);
		}else
			System.out.println(data2+"is not a substring of"+data2);

	}

}
