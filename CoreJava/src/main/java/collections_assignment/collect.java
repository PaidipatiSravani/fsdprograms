package collections_assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class collect {

	public static void main(String[] args) {
		final int a;
		List<Integer> li=new ArrayList<Integer>();
		li.add(99);
		li.add(10);
		
		Iterator it=li.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

	}

}
