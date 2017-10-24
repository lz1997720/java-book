package Time_04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import Time_03.Student;

/*
*
* 练习：用集合存储5个学生对象，并把学生对象进行遍历。用迭代器遍历。
* 
* 注意：
* 		A:自己的类名不要和我们学习的要使用的API中的类名相同。
* 		B:复制代码的时候，很容易把那个类所在的包也导入过来，容易出现不能理解的问题。
*/
public class IteratorTest {

	public static void main(String[] args) {
		Collection c = new ArrayList();

		Student s1 = new Student("罗铮", 20);
		Student s2 = new Student("徐培源", 20);
		Student s3 = new Student("彭家辉", 22);
		Student s4 = new Student("宋天健", 20);
		Student s5 = new Student("孙昊", 21);

		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);

		Iterator it = c.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}

}
