package IO4;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ������ͨ������ķ�ʽȷʵ����ǰһ�ζ�ȡһ���ֽڵķ�ʽ��ܶ࣬���ԣ�������һ�����������Ƿǳ��õ�
 * ��Ȼ�������Ļ���java��ʼ����Ƶ�ʱ��Ҳ���ǵ���������⣬��ר���ṩ�˴����������ֽ��ࡣ
 * ���ֱ���Ϊ������������Ч�ࣩ
 * 
 * д���ݣ�BufferedOutputStream
 * �����ݣ�BufferedInputStream
 * 
 * ���췽������ָ���������Ĵ�С����������һ���ò��ϣ���ΪĬ�ϻ�������С���㹻��
 * �ֽڻ������������ṩ��������Ϊ��У��Ƶģ������أ������Ķ�д�������Ļ�����������ʵ��
 * */
public class BufferedOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		//BufferedOutputStream(OutputStream out)
		FileOutputStream fos = new FileOutputStream("fox.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		//д����
		bos.write("hello".getBytes());
		
		bos.close();
		
	}

}
