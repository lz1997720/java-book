package Time_05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * ���󣺴洢�ַ�����������
 * 
 * ������
 * 		A:�������϶���
 * 		B:�����ַ�������
 * 		C:���ַ���������ӵ�������
 * 		D:��������
 */
public class CollectionTest {

	public static void main(String[] args) {
		Collection c = new ArrayList();

		c.add("���");
		c.add("���콡");
		c.add("����Դ");
		c.add("��һ�");
		c.add("���");

		Iterator it = c.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}
	}

}
