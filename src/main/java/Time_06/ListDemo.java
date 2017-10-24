package Time_06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 需求：List集合存储字符串并遍历。
 */
public class ListDemo {

	public static void main(String[] args) {
		List list = new ArrayList();

		list.add("hello");
		list.add("world");
		list.add("java");

		Iterator it = list.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}
	}

}
