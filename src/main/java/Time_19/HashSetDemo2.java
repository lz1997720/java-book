package Time_19;

import java.util.HashSet;

/*
 * ���󣺴洢�Զ�����󣬲���֤Ԫ�ص�Ψһ��
 * Ҫ�������������ĳ�Ա����ֵ����ͬ����Ϊͬһ��Ԫ�ء�
 * 
 * Ŀǰ�ǲ������ҵ�Ҫ��ģ���Ϊ����֪��HashSet�ײ���������hashCode()��equals()������
 * ������������������ѧ������û����д�����ԣ�Ĭ��ʹ�õ���Object�ࡣ
 * ���ʱ�����ǵĹ�ϣֵ�ǲ���һ���ģ������Ͳ�������жϣ�ִ������Ӳ�����
 */
public class HashSetDemo2 {

	public static void main(String[] args) {
		HashSet<Student> hs = new HashSet<Student>();

		Student s1 = new Student("���", 20);
		Student s2 = new Student("���콡", 20);
		Student s3 = new Student("���", 22);
		Student s4 = new Student("����Դ", 20);
		Student s5 = new Student("��һ�", 22);
		Student s6 = new Student("���", 21);

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
