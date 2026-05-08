package collection;

import java.util.HashSet;
import java.util.Set;

public class GenericSetMethods {

	public static void main(String[] args) {
		Set <String> a = new HashSet <String>();
		a.add("Apple");
		a.add("banana");
		a.add("Orange");
		System.out.println(a);
		Set <String> b = new HashSet <String> ();
		b.add("graphes");
		b.add("Watermelon");
		a.addAll(b);
		System.out.println(a);
		System.out.println(a.contains("Orange"));
		System.out.println(a.containsAll(b));
		System.out.println(b.containsAll(a));
		System.out.println(a.isEmpty());
		System.out.println(b.isEmpty());
		a.remove("banana");
		System.out.println(a);
		System.out.println(a.size());
		a.removeAll(b);
		System.out.println(a);
		a.clear();
		System.out.println(a);
		
		
		

		// TODO Auto-generated method stub

	}

}
