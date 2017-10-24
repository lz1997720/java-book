package Time_10;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList array = new ArrayList();

		Student s1 = new Student("罗铮", 20);
		Student s2 = new Student("宋天健", 20);
		Student s3 = new Student("彭家辉", 22);
		Student s4 = new Student("孙昊", 21);

		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);

		Iterator it = array.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}

		System.out.println("----------------");

		for (int x = 0; x < array.size(); x++) {
			// ClassCastException 注意，千万要搞清楚类型
			// String s = (String) array.get(x);
			// System.out.println(s);

			Student s = (Student) array.get(x);
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}

}
