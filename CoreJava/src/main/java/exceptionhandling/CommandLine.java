package exceptionhandling;

public class CommandLine {

	public static void main(String[] args) {
		int count=0;
		//int range=Integer.parseInt(args[0]);
		for(int i=1;i<4;i++){
			
			try {
				int  number=Integer.parseInt(args[i]);
			} catch (NumberFormatException e) {
				count++;
			}
			
		}System.out.println("the invalid integers are:"+count);

	}

}
