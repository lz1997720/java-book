package Time_03;

import java.util.ArrayList;
import java.util.Collection;

/*
*
* ��ϰ���ü��ϴ洢5��ѧ�����󣬲���ѧ��������б�����
* 
* ������
* A:����ѧ����
* B:�������϶���
* C:����ѧ������
* D:��ѧ����ӵ�����
* E:�Ѽ���ת������
* F:��������
*/
public class StudentDemo {

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

		Object[] objs = c.toArray();
		for (int x = 0; x < objs.length; x++) {
			/*�����ǵ�ֵַ
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
