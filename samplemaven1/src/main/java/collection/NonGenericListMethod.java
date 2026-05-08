package collection;

import java.util.ArrayList;
import java.util.List;

public class NonGenericListMethod {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("apple");
		list.add("Mango");
		list.add(1234);
		list.add(10.2);
		System.out.println(list);
		list.add("Orange");
		System.out.println(list);
		System.out.println(list.get(0));
		list.set(0,"kiwi");
		System.out.println(list);
		System.out.println(list.indexOf("Orange"));
		System.out.println(list.indexOf("kiwi"));
		list.add("Mango");
		System.out.println(list);
		System.out.println(list.lastIndexOf("Mango"));
		list.remove("Mango");
		System.out.println(list);
		System.out.println(list.contains(10.2));
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		
	}

}
