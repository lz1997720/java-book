package IO3;

import java.util.Arrays;

/*
 * ��������ʶ��ʲôʱ��ð������ֽ�ת��Ϊһ�������أ�
 * �ڼ���������ĵĴ洢�������ַ�
 * 	��һ���ַ��϶��Ǹ�����
 * 	�ڶ����ַ��������Ǹ����������и���������û��Ӱ��
 * */
public class StringDemo {

	public static void main(String[] args) {
		String s = "abcd";
		byte [] bys = s.getBytes();
		System.out.println(Arrays.toString(bys));//[97, 98, 99, 100]
		
		String ss = "ʱ���������һ��";
		byte [] byss = ss.getBytes();
		System.out.println(Arrays.toString(byss));//[-54, -79, -68, -28, -65, -55, -46, -44, -42, -50, -45, -6, -46, -69, -57, -48]
		
		//
		
		
	}

}
