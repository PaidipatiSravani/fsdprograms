package collections_assignment;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("hello");
		v.add(10);
		v.add('c');
		v.add(10);
		v.add(20);
		v.add(null);
		
		Enumeration e=v.elements();
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
		
		Iterator i=v.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}

	}

}
