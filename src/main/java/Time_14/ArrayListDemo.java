package Time_14;

import java.util.ArrayList;

/*
 * 集合的嵌套遍历
 * 需求：
 * 		我们班有学生，每一个学生是不是一个对象。所以我们可以使用一个集合表示我们班级的学生。ArrayList<Student>
 * 		但是呢，我们旁边是不是还有班级，每个班级是不是也是一个ArrayList<Student>。
 * 		而我现在有多个ArrayList<Student>。也要用集合存储，怎么办呢?
 * 		就是这个样子的：ArrayList<ArrayList<Student>>
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<ArrayList<Student>> bigArrayList = new ArrayList<ArrayList<Student>>();

		ArrayList<Student> firstArrayList = new ArrayList<Student>();

		Student s1 = new Student("罗铮", 20);
		Student s2 = new Student("宋天健", 20);
		Student s3 = new Student("徐培源", 20);
		Student s4 = new Student("孙昊", 21);
		Student s5 = new Student("彭家辉", 22);

		firstArrayList.add(s1);
		firstArrayList.add(s2);
		firstArrayList.add(s3);
		firstArrayList.add(s4);
		firstArrayList.add(s5);

		bigArrayList.add(firstArrayList);


		ArrayList<Student> secondArrayList = new ArrayList<Student>();

		Student s11 = new Student("代春鹏", 21);
		Student s22 = new Student("章文睿", 20);
		Student s33 = new Student("孙瑜", 22);

		secondArrayList.add(s11);
		secondArrayList.add(s22);
		secondArrayList.add(s33);

		bigArrayList.add(secondArrayList);

		ArrayList<Student> thirdArrayList = new ArrayList<Student>();

		Student s111 = new Student("黄石峰", 32);
		Student s222 = new Student("任向杰", 22);
		Student s333 = new Student("魏伟", 29);
		Student s444 = new Student("李云龙", 88);

		thirdArrayList.add(s111);
		thirdArrayList.add(s222);
		thirdArrayList.add(s333);
		thirdArrayList.add(s444);

		bigArrayList.add(thirdArrayList);

		for (ArrayList<Student> array : bigArrayList) {
			for (Student s : array) {
				System.out.println(s.getName() + "---" + s.getAge());
			}
		}
	}
}
