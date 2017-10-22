package IO2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * һ�ζ�ȡһ���ֽ����飺int read (byte[] b):һ�ζ�ȡһ���ֽ�����
 * ����ֵ����ʵ�ʶ�ȡ�ֽڵĸ���
 * 
 * 
 * ���ֶ�дһ��������ٶ����Ա�һ�ζ�дһ���ֽڵ��ٶȿ�ܶ࣬���Ǽ������������Ļ�����Ч����
 * */
public class FileInputStreamDemo2 {

	public static void main(String[] args) throws IOException {
		// �����ֽ�������
		FileInputStream fis = new FileInputStream("fis2.txt");

		// ��ȡ����
		// ����һ���ֽ�����
		// ��һ�ζ�ȡ
//		byte[] bys = new byte[5];
//		int len = fis.read(bys);
//		System.out.println(len);
//		//System.out.println(new String(bys));
//		System.out.println(new String(bys,0,len));
//
//		// �ڶ��ζ�ȡ
//		len = fis.read(bys);
//		System.out.println(len);
//		System.out.println(new String(bys,0,len));
//
//		// �����ζ�ȡ
//		len = fis.read(bys);
//		System.out.println(len);
//		System.out.println(new String(bys,0,len));
//
//		// ���Ĵζ�ȡ
//		len = fis.read(bys);
//		System.out.println(len);
//		System.out.println(new String(bys,0,len));
		
		
		//����
		//����ĳ���һ����1024��1024��������
		byte [] bys = new byte[1024];
		int len = 0;
		while((len = fis.read(bys)) != -1){
			System.out.println(new String(bys,0,len));
		}
		
		fis.close();
	}

}
