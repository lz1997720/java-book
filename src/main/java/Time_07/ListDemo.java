package Time_07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 存储自定义对象并遍历
 */
public class ListDemo {

	public static void main(String[] args) {
		List list = new ArrayList();

		Student s1 = new Student("白骨精", 30);
		Student s2 = new Student("蜘蛛精", 40);
		Student s3 = new Student("观音姐姐", 22);

		list.add(s1);
		list.add(s2);
		list.add(s3);

		Iterator it = list.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}

}
