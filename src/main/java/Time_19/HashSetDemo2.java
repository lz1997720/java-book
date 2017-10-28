package Time_19;

import java.util.HashSet;

/*
 * 需求：存储自定义对象，并保证元素的唯一性
 * 要求：如果两个对象的成员变量值都相同，则为同一个元素。
 * 
 * 目前是不符合我的要求的：因为我们知道HashSet底层依赖的是hashCode()和equals()方法。
 * 而这两个方法我们在学生类中没有重写，所以，默认使用的是Object类。
 * 这个时候，他们的哈希值是不会一样的，根本就不会继续判断，执行了添加操作。
 */
public class HashSetDemo2 {

	public static void main(String[] args) {
		HashSet<Student> hs = new HashSet<Student>();

		Student s1 = new Student("罗铮", 20);
		Student s2 = new Student("宋天健", 20);
		Student s3 = new Student("孙昊", 22);
		Student s4 = new Student("徐培源", 20);
		Student s5 = new Student("彭家辉", 22);
		Student s6 = new Student("罗铮", 21);

		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		hs.add(s5);
		hs.add(s6);

		for (Student s : hs) {
			System.out.println(s.getName() + "---" + s.getAge());
		}

	}

}
