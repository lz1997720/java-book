package IO11;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

/*
 * �ַ���Ϊ�˸�Ч��д��Ҳ�ṩ�˶�Ӧ���ַ�������
 * BufferedWriter���ַ����������
 * BufferedReader���ַ�����������
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
