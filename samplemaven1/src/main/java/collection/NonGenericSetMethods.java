package collection;

import java.util.HashSet;
import java.util.Set;

public class NonGenericSetMethods {

	public static void main(String[] args) {
		Set s = new HashSet();
		s.add("rabbit");
		s.add("rat");
		s.add("butterfly");
		Set a = new HashSet();
		a.add("dog");
		a.add("cat");
		s.addAll(a);
		System.out.println(s);
		System.out.println(s.contains("rat"));
		System.out.println(s.containsAll(a));
		System.out.println(a.containsAll(s));
		System.out.println(s.isEmpty());
		s.remove("rat");
		System.out.println(s);
		System.out.println(s.size());
		s.clear();
		System.out.println(s);
		
		}

}
