package IO8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * InputStreamReader(InputStream is)
 * InputStreamReader(InputStream is),String charsetName
 * 
 * */
public class InputStreamReaderDemo {

	public static void main(String[] args) throws IOException {
		//InputStreamReader isr = new InputStreamReader(new FileInputStream("osw.txt"));
		//InputStreamReader isr = new InputStreamReader(new FileInputStream("osw.txt"),"GBK");
		InputStreamReader isr = new InputStreamReader(new FileInputStream("osw.txt"),"UTF-8");
		//按照什么编码格式写，就按照什么编码格式读取
		
		
		//两种读取方式
		//一次读取一个字符
		int ch =0;
		while((ch=isr.read())!=-1){
			System.out.print((char)ch);
		}
	
		
		isr.close();
		
	}

}
