package IO9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * �ַ�����ȡ���ݵ����ַ���
 * int read();һ�ζ�ȡһ���ַ�
 * int read(char[] chs);һ�ζ�ȡһ���ַ�����
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
		
		//������ʵ������ֽ����ķ���һ��
		isr.close();
	}

}
