package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * IO���ķ��ࣺ
 * 		��������� ��ȡ����
 * 			  ����� д������
 * 		�������ͣ�
 * 				�ֽ���
 * 					�ֽ������� ������ InputStream
 * 					�ֽ������  д���� OutputStream
 * 
 * 				�ַ���
 * 					�ַ������� ������ Reader
 * 					�ַ������ д���� Writer
 * 
 * 	ע�⣺����һ����̽��IO����ʱ�����û����ȷ˵���������ַ�����˵��Ĭ���ǰ�������������˵
 * 
 * 
 *������Ҫ��һ���ı��ļ�����һ�仰��hello,IO. 	
 *
 *������
 *		A:�����������ǲ����ַ��������������ַ��������ֽ���֮��ų��ֵģ����������ֽ���
 *		B:��������Ҫ���ļ���дһ�仰��������Ҫ�����ֽ��������
 *
 *	ͨ������ķ���������֪��Ҫʹ�����OutputStream
 *	���ǲ鿴��API�����Ƿ��ָö�����һ�������࣬����ʵ����
 *	��������Ҫ��һ�����������
 *	������Ҫ�ҵ�������ʲô�أ�FileOutputStream
 *	ע�⣺ÿ�ֻ���������඼���Ը�������Ϊ��׺����
 *		XxxOutputStream
 *		XxxIputputStream
 *		XxxReader
 *		XxxWriter
 *
 *�ֽ������������
 *			�����ֽ��������
 *			д����
 *			�ͷ���Դ
 * */
public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		//�����ֽ����������
		//FileOutputStream(File file)
//		File file = new File("fos.txt");
//		FileOutputStream fos = new FileOutputStream(file);
		
		//��һ�δ������������������
		FileOutputStream fos = new FileOutputStream("fos.txt");
		
		/*
		 * �����ֽ����������
		 * A:����ϵͳ����ȥ�����ļ�
		 * B:����fos����
		 * C:��fos����ָ������ļ�
		 * */
		
		//д����
		fos.write("hello,IO".getBytes());
		
		//�ر���Ϊ����������������
		//֪ͨϵͳȥ�ͷŸ����ļ���ص���Դ����Ϊϵͳ������ǹ�������ļ�
		fos.close();
	}

}
