package Time_25;

import java.util.HashSet;
import java.util.Random;

/*
 * ��дһ�����򣬻�ȡ10��1��20���������Ҫ������������ظ���
 * 
 * ������
 * 		A:�������������
 * 		B:����һ��HashSet����
 * 		C:�жϼ��ϵĳ����ǲ���С��10
 * 			�ǣ��ʹ���һ����������
 * 			�񣺲�������
 * 		D:����HashSet����
 */
public class HashSetDemo {

	public static void main(String[] args) {
		Random r = new Random();

		HashSet<Integer> ts = new HashSet<Integer>();

		while (ts.size() < 10) {
			int num = r.nextInt(20) + 1;
			ts.add(num);
		}

		for (Integer i : ts) {
			System.out.println(i);
		}

	}

}
