package Time_15;

import java.util.ArrayList;
import java.util.Random;

/*
 * ��ȡ10��1-20֮����������Ҫ�����ظ�
 * 
 * ������ʵ�֣���������ĳ����ǹ̶��ģ����Ȳ���ȷ����
 * ��������ʹ�ü���ʵ�֡�
 * 
 * ������
 * 		A:��������������Ķ���
 * 		B:����һ���洢������ļ��ϡ�
 * 		C:����һ��ͳ�Ʊ�������0��ʼ��
 * 		D:�ж�ͳ�Ʊ����Ƿ�С��10
 * 			��:�Ȳ���һ����������жϸ�������ڼ������Ƿ���ڡ�
 * 					���������:����ӣ�ͳ�Ʊ���++��
 * 					�������:�Ͳ���������
 * 			�񣺲�������
 * 		E:��������
 */
public class RandomDemo {

	public static void main(String[] args) {
		Random r = new Random();

		ArrayList<Integer> array = new ArrayList<Integer>();

		int count = 0;

		while (count < 10) {
			int number = r.nextInt(20) + 1;
			if (!array.contains(number)) {
				array.add(number);
				count++;
			}
		}

		for (Integer i : array) {
			System.out.println(i);
		}

	}

}
