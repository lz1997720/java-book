package IO7;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
 * String [byte [] bytes ,String charsetName]:ͨ��ָ�����ַ�������
 * byte[] getBytes (String charsetName):ʹ��ָ�����ַ��������ַ�������Ϊ�ֽ���
 * 
 * ���룺�ѿ��ö��ı�ɿ�������
 * String -- byte[]
 * 
 * ���룺�ѿ������ı�ɿ��ö���
 * byte[] -- String 
 * 
 * 
 * 
 * ��������սƬ�����籨�����յ籨��
 * ���С����
 * 		�ַ�����ֵ
 * 
 * Ҫ����һ�����֣�
 * 	�����������ϵط���
 * 		
 * 
 * ��������򵥣�ֻҪ�������ĸ�ʽ��һ�µģ��Ͳ���������
 * 
 * */
public class StringDemo {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String s = "���";
		
		//String -- byte
		//byte[] bys = s.getBytes();//[-60, -29, -70, -61]
		//byte[] bys = s.getBytes("GBK");//[-60, -29, -70, -61]
		byte[] bys = s.getBytes("UTF-8");
		System.out.println(Arrays.toString(bys));//[-28, -67, -96, -27, -91, -67]
		
		//byte[] -- String
		String ss = new String(bys);//���你好
		//String ss = new String(bys,"GBK");//���
		//String ss = new String(bys,"UTF-8");//??? ���
		System.out.println(ss);
		//���벻һ�������벻һ��������һ��������һ��
		
		
		
	}

}
