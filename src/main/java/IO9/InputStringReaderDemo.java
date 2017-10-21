package IO9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 字符流读取数据的两种方法
 * int read();一次读取一个字符
 * int read(char[] chs);一次读取一个字符数组
 * */
public class InputStringReaderDemo {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream("OutputStreamWriterDemo.java")); 
		
//		int ch = 0;
//		while((ch = isr.read())!=-1){
//			System.out.print((char) ch);
//		}
		
		char[] chs = new char[1024];
		int len = 0;
		while((len = isr.read(chs))!=-1){
			System.out.println(new String (chs,0,len));
		}
		
		//发现其实代码和字节流的方法一样
		isr.close();
	}

}
