package Time_14;

import java.util.ArrayList;

/*
 * ���ϵ�Ƕ�ױ���
 * ����
 * 		���ǰ���ѧ����ÿһ��ѧ���ǲ���һ�������������ǿ���ʹ��һ�����ϱ�ʾ���ǰ༶��ѧ����ArrayList<Student>
 * 		�����أ������Ա��ǲ��ǻ��а༶��ÿ���༶�ǲ���Ҳ��һ��ArrayList<Student>��
 * 		���������ж��ArrayList<Student>��ҲҪ�ü��ϴ洢����ô����?
 * 		����������ӵģ�ArrayList<ArrayList<Student>>
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<ArrayList<Student>> bigArrayList = new ArrayList<ArrayList<Student>>();

		ArrayList<Student> firstArrayList = new ArrayList<Student>();

		Student s1 = new Student("���", 20);
		Student s2 = new Student("���콡", 20);
		Student s3 = new Student("����Դ", 20);
		Student s4 = new Student("���", 21);
		Student s5 = new Student("��һ�", 22);

		firstArrayList.add(s1);
		firstArrayList.add(s2);
		firstArrayList.add(s3);
		firstArrayList.add(s4);
		firstArrayList.add(s5);

		bigArrayList.add(firstArrayList);


		ArrayList<Student> secondArrayList = new ArrayList<Student>();

		Student s11 = new Student("������", 21);
		Student s22 = new Student("�����", 20);
		Student s33 = new Student("���", 22);

		secondArrayList.add(s11);
		secondArrayList.add(s22);
		secondArrayList.add(s33);

		bigArrayList.add(secondArrayList);

		ArrayList<Student> thirdArrayList = new ArrayList<Student>();

		Student s111 = new Student("��ʯ��", 32);
		Student s222 = new Student("�����", 22);
		Student s333 = new Student("κΰ", 29);
		Student s444 = new Student("������", 88);

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
