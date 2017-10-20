package IO2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 一次读取一个字节数组：int read (byte[] b):一次读取一个字节数组
 * 返回值是是实际读取字节的个数
 * 
 * 
 * 发现读写一个数组的速度明显比一次读写一个字节的速度快很多，这是加入数组这样的缓冲区效果。
 * */
public class FileInputStreamDemo2 {

	public static void main(String[] args) throws IOException {
		// 创建字节输入流
		FileInputStream fis = new FileInputStream("fis2.txt");

		// 读取数据
		// 定义一个字节数组
		// 第一次读取
//		byte[] bys = new byte[5];
//		int len = fis.read(bys);
//		System.out.println(len);
//		//System.out.println(new String(bys));
//		System.out.println(new String(bys,0,len));
//
//		// 第二次读取
//		len = fis.read(bys);
//		System.out.println(len);
//		System.out.println(new String(bys,0,len));
//
//		// 第三次读取
//		len = fis.read(bys);
//		System.out.println(len);
//		System.out.println(new String(bys,0,len));
//
//		// 第四次读取
//		len = fis.read(bys);
//		System.out.println(len);
//		System.out.println(new String(bys,0,len));
		
		
		//最终
		//数组的长度一般是1024或1024的整数倍
		byte [] bys = new byte[1024];
		int len = 0;
		while((len = fis.read(bys)) != -1){
			System.out.println(new String(bys,0,len));
		}
		
		fis.close();
	}

}
