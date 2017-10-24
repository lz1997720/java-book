package Time_12;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3 {
	public static void main(String[] args) {
		ArrayList array = new ArrayList();

		Student s1 = new Student("ÂŞï£", 20);
		Student s2 = new Student("ËÎÌì½¡", 40);
		Student s3 = new Student("Ëïê»", 35);
		Student s4 = new Student("ĞìÅàÔ´", 18);
		Student s5 = new Student("Åí¼Ò»Ô", 16);
		Student s6 = new Student("»ÆÊ¯·å", 27);
		Student s7 = new Student("»ÆÊ¯·å", 18);

		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		array.add(s5);
		array.add(s6);
		array.add(s7);

		ArrayList newArray = new ArrayList();

		Iterator it = array.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();

			if (!newArray.contains(s)) {
				newArray.add(s);
			}
		}

		for (int x = 0; x < newArray.size(); x++) {
			Student s = (Student) newArray.get(x);
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}