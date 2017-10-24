package Time_03;

import java.util.ArrayList;
import java.util.Collection;

/*
*
* 练习：用集合存储5个学生对象，并把学生对象进行遍历。
* 
* 分析：
* A:创建学生类
* B:创建集合对象
* C:创建学生对象
* D:把学生添加到集合
* E:把集合转成数组
* F:遍历数组
*/
public class StudentDemo {

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

		Object[] objs = c.toArray();
		for (int x = 0; x < objs.length; x++) {
			/*传的是地址值
			 * Time_03.Student@15db9742 Time_03.Student@6d06d69c
			 * Time_03.Student@7852e922 Time_03.Student@4e25154f
			 * Time_03.Student@70dea4e
			 */
			// System.out.println(objs[x]);
			Student s = (Student) objs[x];
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}

}
