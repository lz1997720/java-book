package IO9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/*
 * OutputStreamWriter的五种写数据的方式
 * publc void write(int c)：写一个字符
 * public void write(char [] cbuf)：写一个字符数组
 * public void write(char[] cbuf,int off,int len)写一个字符数组的一部分
 * public void write(String str)写一个字符串
 * public void write(String str,int off,int len)写一个字符串的一部分
 * 
 * 面试题：close()和flush()的区别
 * A:close()关闭流对象，但是先刷新一次缓冲区，关闭之后，该对象不可以继续使用了 。
 * B:flush()仅仅刷新缓冲区，刷新之后流对象还可以继续使用。
 * 
 * 		
 * 
 * */
public class OutputStreamWriterDemo {

	public static void main(String[] args) throws IOException {
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw2.txt"));
		
		osw.write('a');
		//publc void write(int c)：写一个字符
		osw.write(97);
		//为什么数据没有进去
		//原因是：字符 = 2字节
		//文件中数据存储单位是字节
		//void flush()
		
		//public void write(char [] cbuf)：写一个字符数组
		char[] chs = {'a','b','c','d','d','e'};
		osw.write(chs);
		
		//public void write(char[] cbuf,int off,int len)写一个字符数组的一部分
		osw.write(chs,1,3);
		
		//public void write(String str)写一个字符串
		osw.write("时间可以治愈一切");
		
		//public void write(String str,int off,int len)写一个字符串的一部分
		osw.write("时间可以治愈一切",0,2);
		
		//刷新缓冲区
		osw.flush();//很多次之后再刷新，不要每次都刷新
		osw.write("时间可以治愈一切",0,2);
		osw.close();
		
	}

}
