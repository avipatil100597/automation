package Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class hashset2 {
	public static void main(String[] args) {
		// 1. create array list
		ArrayList al = new ArrayList();// build-in class

		// 2/ Initialize array list
		al.add("Reshma");
		al.add('A');
		al.add(200);
		al.add(45.56f);
		al.add(true);
		al.add(200);
		al.add(null);
		al.add(null);
		al.add('A');
		System.out.println(al);//[Reshma, A, 200, 45.56, true, 200, null, null, A]
		
		HashSet hs = new HashSet(al);
		System.out.println(hs);//[null, A, 45.56, 200, Reshma, true]

		
	}
}

