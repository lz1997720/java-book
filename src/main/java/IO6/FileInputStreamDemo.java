package IO6;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * �ֽ�����ȡ���Ŀ��ܳ��ֵ�С����
 * 
 * 
 * ת�������ֵ�ԭ��˼��
 * 	�����ֽ����������Ĳ����ر𷽱㣬���ԣ�java���ṩ��ת����
 * �ַ��� = �ֽ���+�����
 * 
 * ���������ʵ������ַ��Ͷ�Ӧ����ֵ��ɵ�һ�ű�
 * ASC��������λΪ����λ������Ϊ��ֵλ��
 * ISO-8859-1��������� 8λ��ʾһ������
 * 
 * gb2312����������
 * gbk���й������ı�������
 * gb18030��ȡ���汾
 * 
 * Unicode�����ʱ�׼�룬�ں��˶������֡�
 * 			�������ֶ��������ֽڱ�ʾ��java����ʹ�õľ���unicode
 * UTF��8����������ֽ�����ʾһ���ַ�
 * */
public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("a.txt");
		
//		int by = 0;
//		while((by = fis.read())!=-1){
//			System.out.print((char)by);
//		}
		
		//�������ɲ��У���Ϊ���1023��Ϊ�����ֽڣ��������ӻ�����ʾ��������
		byte[]bys = new byte[1024];
		int len = 0;
		while((len = fis.read(bys))!=-1){
			System.out.println(new String(bys,0,len));
		}
		
		fis.close();
		
	}

}
