package Time_20;

import java.util.HashSet;

public class DogDemo {

	public static void main(String[] args) {
		HashSet<Dog> hs = new HashSet<Dog>();

		Dog d1 = new Dog("����", 25, "��ɫ", '��');
		Dog d2 = new Dog("��ٴ", 22, "��ɫ", 'Ů');
		Dog d3 = new Dog("����", 25, "��ɫ", '��');
		Dog d4 = new Dog("����", 20, "��ɫ", 'Ů');
		Dog d5 = new Dog("κ����", 28, "��ɫ", '��');
		Dog d6 = new Dog("����Ӣ", 23, "��ɫ", 'Ů');
		Dog d7 = new Dog("����Ӣ", 23, "��ɫ", 'Ů');
		Dog d8 = new Dog("����Ӣ", 23, "��ɫ", '��');

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
