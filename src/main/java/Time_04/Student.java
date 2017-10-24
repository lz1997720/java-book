package Time_04;
/*
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
public class Student {
	private String name;
	private int age;

	public Student() {
		super();
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
