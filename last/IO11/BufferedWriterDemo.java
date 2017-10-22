package IO11;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

/*
 * 字符流为了高效读写，也提供了对应的字符缓冲流
 * BufferedWriter：字符缓冲输出流
 * BufferedReader：字符缓冲输入流
 * 
 * 
 * */
public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("bw.txt")));
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("bw.txt"));
		
		bw.write("Time");
		bw.flush();
		bw.close();
		
		
	}

}
