package IO10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 需求：把当前目录下的a.txt内容复制到当前目录下的c.txt中
 * 数据源：
 * 		a.txt -- 读取数据 --字符转换流 -- InputStreamReader
 * 目的地：
 * 		b.txt -- xie'chu'shu'ju
 * 
 * */
public class CopyFileDemo {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream("a.txt"));
		
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("c.txt"));
		
		//读写数据
		//方式一
//		int ch =0;
//		while((ch = isr.read())!=-1){
//			osw.write(ch);
//			System.out.print((char)ch);
//		}
//		osw.flush();
		
		
		//方式二
		char[]chs = new char[1024];
		int len =0;
		while((len = isr.read(chs))!=-1){
			osw.write(chs,0,len);
		}
		
		osw.close();
		isr.close();
		
	}

}
