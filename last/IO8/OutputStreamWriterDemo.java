package IO8;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * OutputStreamWriter(OutputStream out ):根据默认编码把字节流数据转换为字符流
 * OutputStreamWriter(OutputStream out, String charsetName):根据指定编码把字节流数据转换为字符流
 * 把字节流转换为字符流
 * 字符流 = 字节流 +编码表
 * */
public class OutputStreamWriterDemo {
	public static void main(String[] args) throws IOException {
		//默认GBK
		//OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw.txt"));
		
		//指定GBK
		//OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw.txt"),"GBK");
		
		//指定UTF-8
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw.txt"),"UTF-8");

		osw.write("中国");

		osw.close();

	}

}
