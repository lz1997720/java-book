package IO2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 字节输入流操作步骤
 *  A:创建字节输入流对象
 *  B:调用read()方法读取数据，并把数据显示在控制台
 *  C:释放资源
 *  
 *  读取数据的方式：
 *  A:int read()
 *  B:int read (byte[] b):一次读取一个字节数组
 * */
public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		//FileInputStream(String name )
		FileInputStream fis = new FileInputStream("fis.txt");
		
		//调用read(0方法读取数据，并把数据显示在控制台
		//第一次都去、、读取
//		int by = fis.read();
//		System.out.println(by);
//		System.out.println((char)by);
		
		//第二次读取
//		by = fis.read();
//		System.out.println(by);
//		System.out.println((char)by);
		
		
		//第三次读取
//		by = fis.read();
//		System.out.println(by);
//		System.out.println((char)by);
		
		
		//第四次
//		by = fis.read();
//		System.out.println(by);
//		System.out.println((char)by);
//		
		
		//我们发现代码的重复都太高了
		//需要循环了,通过测试，如果读取的数据是-1，就说明已经读取到文件的末尾了
//		int by = fis.read();
//		while(by != -1){
//			System.out.print((char) by);
//			by = fis.read();
//		}
		
		//最终
		int by = 0;
		//读取赋值判断
		while((by = fis.read()) != -1){
			System.out.print((char) by);
		}
		//但是读取不到中文！字节流读取基本数据，但中文不行，需要改进
		
		//释放数据
		fis.close();
	}

}
