package IO9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/*
 * OutputStreamWriter������д���ݵķ�ʽ
 * publc void write(int c)��дһ���ַ�
 * public void write(char [] cbuf)��дһ���ַ�����
 * public void write(char[] cbuf,int off,int len)дһ���ַ������һ����
 * public void write(String str)дһ���ַ���
 * public void write(String str,int off,int len)дһ���ַ�����һ����
 * 
 * �����⣺close()��flush()������
 * A:close()�ر������󣬵�����ˢ��һ�λ��������ر�֮�󣬸ö��󲻿��Լ���ʹ���� ��
 * B:flush()����ˢ�»�������ˢ��֮�������󻹿��Լ���ʹ�á�
 * 
 * 		
 * 
 * */
public class OutputStreamWriterDemo {

	public static void main(String[] args) throws IOException {
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw2.txt"));
		
		osw.write('a');
		//publc void write(int c)��дһ���ַ�
		osw.write(97);
		//Ϊʲô����û�н�ȥ
		//ԭ���ǣ��ַ� = 2�ֽ�
		//�ļ������ݴ洢��λ���ֽ�
		//void flush()
		
		//public void write(char [] cbuf)��дһ���ַ�����
		char[] chs = {'a','b','c','d','d','e'};
		osw.write(chs);
		
		//public void write(char[] cbuf,int off,int len)дһ���ַ������һ����
		osw.write(chs,1,3);
		
		//public void write(String str)дһ���ַ���
		osw.write("ʱ���������һ��");
		
		//public void write(String str,int off,int len)дһ���ַ�����һ����
		osw.write("ʱ���������һ��",0,2);
		
		//ˢ�»�����
		osw.flush();//�ܶ��֮����ˢ�£���Ҫÿ�ζ�ˢ��
		osw.write("ʱ���������һ��",0,2);
		osw.close();
		
	}

}
