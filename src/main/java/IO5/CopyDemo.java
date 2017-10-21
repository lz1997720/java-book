package IO5;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ���󣺰�D:\\no.mp3���Ƶ���ǰĿ¼�µ�copy.mp4��
 * 
 * �ֽ��������ָ��Ʒ�ʽ��
 * �����ֽ���һ�ζ�дһ���ֽڣ�
 * �����ֽ���һ�ζ�дһ���ֽ�����
 * ��Ч�ֽ���һ�ζ�дһ���ֽڣ�
 * ��Ч�ֽ���һ�ζ�дһ���ֽ�����
 * 
 * */
public class CopyDemo {
	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		 method1("D:\\Time.mp3", "copy.mp3");//32636
		//method2("D:\\Time.mp3","copy.mp3");//56
		//method3("D:\\Time.mp3","copy.mp3");//361
		//method4("D:\\Time.mp3", "copy.mp3");// 78
		long end = System.currentTimeMillis();
		System.out.println("������ʱ�䣺" + (end - start) + "����");

	}

	// �����ֽ���һ�ζ�дһ���ֽ�
	public static void method1(String srcString, String destString) throws IOException {
		FileInputStream fis = new FileInputStream(srcString);
		FileOutputStream fos = new FileOutputStream(destString);

		int by = 0;
		while ((by = fis.read()) != -1) {
			fos.write(by);
		}

		fos.close();
		fis.close();
	}

	// �����ֽ���һ�ζ�дһ���ֽ�����
	public static void method2(String srcString, String destString) throws IOException {
		FileInputStream fis = new FileInputStream(srcString);
		FileOutputStream fos = new FileOutputStream(destString);

		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = fis.read(bys)) != -1) {
			fos.write(bys, 0, len);
		}

		fos.close();
		fis.close();
	}

	// ��Ч�ֽ���һ�ζ�дһ���ֽڣ�
	public static void method3(String srcString, String destString) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcString));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destString));

		int by = 0;
		while ((by = bis.read()) != -1) {
			bos.write(by);

		}

		bos.close();
		bis.close();
	}

	// ��Ч�ֽ���һ�ζ�дһ���ֽ����飺
	public static void method4(String srcString, String destString) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcString));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destString));

		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = bis.read(bys)) != -1) {
			bos.write(bys, 0, len);
		}

		bos.close();
		bis.close();
	}
}
