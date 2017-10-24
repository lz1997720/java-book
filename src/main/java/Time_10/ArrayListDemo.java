package Time_10;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList array = new ArrayList();

		array.add("hello");
		array.add("world");
		array.add("java");

		Iterator it = array.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}

		System.out.println("-----------");

		for (int x = 0; x < array.size(); x++) {
			String s = (String) array.get(x);
			System.out.println(s);
		}
	}

}
