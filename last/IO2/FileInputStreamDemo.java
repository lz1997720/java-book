package IO2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * �ֽ���������������
 *  A:�����ֽ�����������
 *  B:����read()������ȡ���ݣ�����������ʾ�ڿ���̨
 *  C:�ͷ���Դ
 *  
 *  ��ȡ���ݵķ�ʽ��
 *  A:int read()
 *  B:int read (byte[] b):һ�ζ�ȡһ���ֽ�����
 * */
public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		//FileInputStream(String name )
		FileInputStream fis = new FileInputStream("fis.txt");
		
		//����read(0������ȡ���ݣ�����������ʾ�ڿ���̨
		//��һ�ζ�ȥ������ȡ
//		int by = fis.read();
//		System.out.println(by);
//		System.out.println((char)by);
		
		//�ڶ��ζ�ȡ
//		by = fis.read();
//		System.out.println(by);
//		System.out.println((char)by);
		
		
		//�����ζ�ȡ
//		by = fis.read();
//		System.out.println(by);
//		System.out.println((char)by);
		
		
		//���Ĵ�
//		by = fis.read();
//		System.out.println(by);
//		System.out.println((char)by);
//		
		
		//���Ƿ��ִ�����ظ���̫����
		//��Ҫѭ����,ͨ�����ԣ������ȡ��������-1����˵���Ѿ���ȡ���ļ���ĩβ��
//		int by = fis.read();
//		while(by != -1){
//			System.out.print((char) by);
//			by = fis.read();
//		}
		
		//����
		int by = 0;
		//��ȡ��ֵ�ж�
		while((by = fis.read()) != -1){
			System.out.print((char) by);
		}
		//���Ƕ�ȡ�������ģ��ֽ�����ȡ�������ݣ������Ĳ��У���Ҫ�Ľ�
		
		//�ͷ�����
		fis.close();
	}

}
