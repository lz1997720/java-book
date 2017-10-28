package Time_20;

import java.util.HashSet;

public class DogDemo {

	public static void main(String[] args) {
		HashSet<Dog> hs = new HashSet<Dog>();

		Dog d1 = new Dog("秦桧", 25, "红色", '男');
		Dog d2 = new Dog("高俅", 22, "黑色", '女');
		Dog d3 = new Dog("秦桧", 25, "红色", '男');
		Dog d4 = new Dog("秦桧", 20, "红色", '女');
		Dog d5 = new Dog("魏忠贤", 28, "白色", '男');
		Dog d6 = new Dog("李莲英", 23, "黄色", '女');
		Dog d7 = new Dog("李莲英", 23, "黄色", '女');
		Dog d8 = new Dog("李莲英", 23, "黄色", '男');

		hs.add(d1);
		hs.add(d2);
		hs.add(d3);
		hs.add(d4);
		hs.add(d5);
		hs.add(d6);
		hs.add(d7);
		hs.add(d8);

		for (Dog d : hs) {
			System.out.println(d.getName() + "---" + d.getAge() + "---" + d.getColor() + "---" + d.getSex());
		}

	}

}
