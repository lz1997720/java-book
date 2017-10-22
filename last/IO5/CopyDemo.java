package IO5;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 需求：把D:\\no.mp3复制到当前目录下的copy.mp4中
 * 
 * 字节流的四种复制方式：
 * 基本字节流一次读写一个字节；
 * 基本字节流一次读写一个字节数组
 * 高效字节流一次读写一个字节；
 * 高效字节流一次读写一个字节数组
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
		System.out.println("共消耗时间：" + (end - start) + "毫秒");

	}

	// 基本字节流一次读写一个字节
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

	// 基本字节流一次读写一个字节数组
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

	// 高效字节流一次读写一个字节：
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

	// 高效字节流一次读写一个字节数组：
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
