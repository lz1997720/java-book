package IO8;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * OutputStreamWriter(OutputStream out ):����Ĭ�ϱ�����ֽ�������ת��Ϊ�ַ���
 * OutputStreamWriter(OutputStream out, String charsetName):����ָ��������ֽ�������ת��Ϊ�ַ���
 * ���ֽ���ת��Ϊ�ַ���
 * �ַ��� = �ֽ��� +�����
 * */
public class OutputStreamWriterDemo {
	public static void main(String[] args) throws IOException {
		//Ĭ��GBK
		//OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw.txt"));
		
		//ָ��GBK
		//OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw.txt"),"GBK");
		
		//ָ��UTF-8
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw.txt"),"UTF-8");

		osw.write("�й�");

		osw.close();

	}

}
