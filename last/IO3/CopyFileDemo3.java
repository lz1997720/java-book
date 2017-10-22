package IO3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 需要：把C盘的a.jpg内容复制到当前项目目录下的mn.jpg
 * 
 * 数据源：
 * 		C:\\a.txt -- 读取数据	
 * 目的地：
 * 		mn.jpg -- 写出数据 
 * 
 * 
 * */
public class CopyFileDemo3 {

	public static void main(String[] args) throws IOException {
		//封装数据源
		FileInputStream fis = new FileInputStream("C:\\a.jpg");
		//封装目的地
		FileOutputStream fos = new FileOutputStream("D:\\b.jpg");
		
		//复制数据
		int b = 0;
		while ((b = fis.read()) != -1) {
			fos.write(b);
		}
		
		//释放资源
		fis.close();
		fos.close();
		//发现步骤其实都一样，代码也一样，简单除暴，复制视频或音乐文件也是一样的操作

	}

}
