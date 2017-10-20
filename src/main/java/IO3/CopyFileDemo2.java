package IO3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 需求：把c盘下的a.txt的内容复制到d盘下的b.txt中
 * 
 * 数据源：
 *     c:\\a.xtxt   --读取数据-- FileInputStream
 *     
 * 目的地：
 * 		D:\\b.txt   --写数据--   FileOutoutStream
 * */
public class CopyFileDemo2 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\a.txt");
		FileOutputStream fos = new FileOutputStream("D:\\b.txt");
		int b = 0;
		while ((b = fis.read()) != -1) {
			fos.write(b);
		}
		fis.close();
		fos.close();
	}

}
