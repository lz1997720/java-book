package Time_04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import Time_03.Student;

/*
*
* ��ϰ���ü��ϴ洢5��ѧ�����󣬲���ѧ��������б������õ�����������
* 
* ע�⣺
* 		A:�Լ���������Ҫ������ѧϰ��Ҫʹ�õ�API�е�������ͬ��
* 		B:���ƴ����ʱ�򣬺����װ��Ǹ������ڵİ�Ҳ������������׳��ֲ����������⡣
*/
public class IteratorTest {

	public static void main(String[] args) {
		Collection c = new ArrayList();

		Student s1 = new Student("���", 20);
		Student s2 = new Student("����Դ", 20);
		Student s3 = new Student("��һ�", 22);
		Student s4 = new Student("���콡", 20);
		Student s5 = new Student("���", 21);

		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);

		Iterator it = c.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}

}
