package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * IO流的分类：
 * 		流向：输出流 读取数据
 * 			  输出流 写出数据
 * 		数据类型：
 * 				字节流
 * 					字节输入流 读数据 InputStream
 * 					字节输出流  写数据 OutputStream
 * 
 * 				字符流
 * 					字符输入流 读数据 Reader
 * 					字符输出流 写数据 Writer
 * 
 * 	注意：我们一般在探讨IO流的时候，如果没有明确说明按照哪种分类来说，默认是按照数据类型来说
 * 
 * 
 *需求：我要往一个文本文件输入一句话：hello,IO. 	
 *
 *分析：
 *		A:这个操作最好是采用字符流来做，但是字符流是在字节流之后才出现的，所以先用字节流
 *		B:由于我是要往文件中写一句话，所以我要采用字节输出流。
 *
 *	通过上面的分析，我们知道要使用这个OutputStream
 *	但是查看了API，我们发现该对象是一个抽象类，不能实例化
 *	所以我们要找一个具体的子类
 *	而我们要找的子类是什么呢？FileOutputStream
 *	注意：每种基类的派生类都是以父类名作为后缀名。
 *		XxxOutputStream
 *		XxxIputputStream
 *		XxxReader
 *		XxxWriter
 *
 *字节输出流操作：
 *			创建字节输出对象
 *			写数据
 *			释放资源
 * */
public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		//创建字节流输出对象
		//FileOutputStream(File file)
//		File file = new File("fos.txt");
//		FileOutputStream fos = new FileOutputStream(file);
		
		//这一段代码等于上面两个代码
		FileOutputStream fos = new FileOutputStream("fos.txt");
		
		/*
		 * 创建字节流输出对象：
		 * A:调用系统功能去创建文件
		 * B:创建fos对象
		 * C:把fos对象指向这个文件
		 * */
		
		//写数据
		fos.write("hello,IO".getBytes());
		
		//关闭是为了让流对象变成垃圾
		//通知系统去释放跟该文件相关的资源，因为系统会帮我们管理这个文件
		fos.close();
	}

}
