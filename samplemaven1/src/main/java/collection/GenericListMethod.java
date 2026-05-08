package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericListMethod {

	public static void main(String[] args) {
		List <String> L = new ArrayList <String> ();
		L.add("red");
		L.add("pink");
		L.add("green");
		L.add("yellow");
		L.add("red");
		System.out.println(L);
		System.out.println(L.get(2));
		L.set(1,"white");
		System.out.println(L);
		System.out.println(L.indexOf("red"));
		System.out.println(L.indexOf("pink"));
		System.out.println(L.lastIndexOf("red"));
		L.remove(2);
		System.out.println(L);
		System.out.println(L.contains("yellow"));
		System.out.println(L.isEmpty());
		System.out.println(L.size());
		// TODO Auto-generated method stub

	}

}
