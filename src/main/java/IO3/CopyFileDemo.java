package IO3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �����ı��ļ���
 * 
 * ����Դ����������
 * a.txt   ��ȡ����
 * 
 * Ŀ�ĵأ�������ȥ
 * b.txt  д����
 * 
 * 
 * ��һ�θ�������û�г����κ����⣬Ϊʲô�أ�
 * ��һ�����ǳ��������ԭ����������ÿ�λ�ȡ��һ���ֽ����ݣ��ͰѸ��ֽ�����ת��Ϊ���ַ����ݣ�
 * Ȼ�����������̨
 * 
 * ����һ���أ�ȷʵͨ��IO����ȡ���ݣ�д���ı��ļ������ȡһ���ֽڣ��Ҿ�д��һ���ֽڡ���û�����κε�ת��
 * �����Լ���ת����
 * 
 * */
public class CopyFileDemo {

	public static void main(String[] args) throws IOException {
		//��װ����Դ,һ��Ҫ��
		FileInputStream fis = new FileInputStream("a.txt");
		
		//��װĿ�ĵأ�����û�У�������æ����
		FileOutputStream fos = new FileOutputStream("b.txt");
		
		int by = 0;
		while((by=fis.read())!=-1){
			fos.write(by);
		}
		
		//�������ͷ���Դ���ȹ�˭���У�
		fos.close();
		fis.close();
		
	}

}
