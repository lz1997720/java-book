package Time_04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import Time_03.Student;

/*
 * 问题1:能用while循环写这个程序，我能不能用for循环呢?
 * 问题2:不要多次使用it.next()方法，因为每次使用都是访问一个对象。
 */
public class IteratorTest2 {

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

//		Iterator it = c.iterator();
//		while (it.hasNext()) {
//			Student s = (Student) it.next();
//			System.out.println(s.getName() + "---" + s.getAge());
//
//			// NoSuchElementException 不要多次使用it.next()方法
//			// System.out.println(((Student) it.next()).getName() + "---" +
//			// ((Student) it.next()).getAge());
//
//		}
		// System.out.println("----------------------------------");

		 //for循环改写
		 for(Iterator it = c.iterator();it.hasNext();){
		 Student s = (Student) it.next();
		 System.out.println(s.getName() + "---" + s.getAge());
		 }
	}

}
