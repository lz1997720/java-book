package Time_12;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ArrayListȥ���������ַ������ظ�ֵ(�ַ�����������ͬ)
 * 
 * ������
 * 		A:�������϶���
 * 		B:��Ӷ���ַ���Ԫ��(����������ͬ��)
 * 		C:�����¼���
 * 		D:�����ɼ���,��ȡ�õ�ÿһ��Ԫ��
 * 		E:�����Ԫ�ص��¼���ȥ�ң�����û��
 * 			�У���������
 * 			û�У�����ӵ��¼���
 * 		F:�����¼���
 */
public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList array = new ArrayList();

		array.add("hello");
		array.add("world");
		array.add("java");
		array.add("world");
		array.add("java");
		array.add("world");
		array.add("world");
		array.add("world");
		array.add("world");
		array.add("java");
		array.add("world");

		ArrayList newArray = new ArrayList();

		Iterator it = array.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();

			if (!newArray.contains(s)) {
				newArray.add(s);
			}
		}

		for (int x = 0; x < newArray.size(); x++) {
			String s = (String) newArray.get(x);
			System.out.println(s);
		}
	}

}
