package javafundementals_assignment;
/**
 * equals method compares the content present in the string instead of checking their locations.
 * in string ,there is a concept called 'string constant pool'.in this concept whenever you are creating the string using string literal(=)
 * first it will check if that object present in the pool or not.if it is present then it will return the reference of the object.
 * if not then it will create new string in pool.
 * but when you are using new keyword the object is stored in heap memory irrespective of whether that object is present in pool or not.
 * @author sp22082
 *
 */

public class EqualsMethodInString {

	public static void main(String[] args) {
		String name1="hello";
		String name2=new String("hello");
		String name3="hello";
		
		System.out.println(name1==name2);     //it will compare name1 and name2 locations
		System.out.println(name1==name3);
		
		System.out.println("equals method:"+name1.equals(name2));          //it will compare content in objects irrespective of their location.
		System.out.println("equals method:"+name1.equals(name3));
		System.out.println("equals method:"+name2.equals(name3));
	}

}
