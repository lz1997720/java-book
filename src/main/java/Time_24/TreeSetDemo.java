package Time_24;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * 需求：请按照姓名的长度排序
 * 
 * TreeSet集合保证元素排序和唯一性的原理
 * 唯一性：是根据比较的返回是否是0来决定。
 * 排序：
 * 		A:自然排序(元素具备比较性)
 * 			让元素所属的类实现自然排序接口 Comparable
 * 		B:比较器排序(集合具备比较性)
 * 			让集合的构造方法接收一个比较器接口的子类对象 Comparator
 */
public class TreeSetDemo {

	public static void main(String[] args) {
		// 创建集合对象
		// TreeSet<Student> ts = new TreeSet<Student>(); //自然排序
		// public TreeSet(Comparator comparator) //比较器排序
		// TreeSet<Student> ts = new TreeSet<Student>(new MyComparator());

		// 如果一个方法的参数是接口，那么真正要的是接口的实现类的对象
		// 而匿名内部类就可以实现这个东西
		TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
			public int compare(Student s1, Student s2) {
				int num = s1.getName().length() - s2.getName().length();
				int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
				int num3 = num2 == 0 ? s1.getAge() - s2.getAge() : num2;
				return num3;
			}
		});

		Student s1 = new Student("linqingxia", 27);
		Student s2 = new Student("zhangguorong", 29);
		Student s3 = new Student("wanglihong", 23);
		Student s4 = new Student("linqingxia", 27);
		Student s5 = new Student("liushishi", 22);
		Student s6 = new Student("wuqilong", 40);
		Student s7 = new Student("fengqingy", 22);
		Student s8 = new Student("linqingxia", 29);

		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);
		ts.add(s7);
		ts.add(s8);

		for (Student s : ts) {
			System.out.println(s.getName() + "---" + s.getAge());
		}

	}

}
