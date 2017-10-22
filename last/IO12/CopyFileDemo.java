package IO12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileDemo {

	public static void main(String[] args) throws IOException{
				BufferedReader br = new BufferedReader(new FileReader("a.txt"));
				
				BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));

				// 两种方式其中的一种一次读写一个字符数组
				char[] chs = new char[1024];
				int len = 0;
				while ((len = br.read(chs)) != -1) {
					bw.write(chs, 0, len);
					bw.flush();
				}

				// 释放资源
				bw.close();
				br.close();
		
	}

}
