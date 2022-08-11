package javafundementals_assignment;
/**
 * in the string buffer the original string will be modified .so we dont have to create a new string.
 * here the replace have replace(startindex,endindex,"new string").
 * string buffer dont have the replace all method
 * 
 * @author sp22082
 *
 */

public class ReplaceMethod {

	public static void main(String[] args) {
		StringBuffer name=new StringBuffer("hello world");
		System.out.println("name before replacing:"+name);
		
		name.replace(0, name.length(), "HELLO WORLD");                    //to replace the full string start index=0;endindex=name.length
		System.out.println("name after replacing:"+name);
		

	}

}
