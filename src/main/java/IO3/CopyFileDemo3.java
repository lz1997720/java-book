package IO3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ��Ҫ����C�̵�a.jpg���ݸ��Ƶ���ǰ��ĿĿ¼�µ�mn.jpg
 * 
 * ����Դ��
 * 		C:\\a.txt -- ��ȡ����	
 * Ŀ�ĵأ�
 * 		mn.jpg -- д������ 
 * 
 * 
 * */
public class CopyFileDemo3 {

	public static void main(String[] args) throws IOException {
		//��װ����Դ
		FileInputStream fis = new FileInputStream("C:\\a.jpg");
		//��װĿ�ĵ�
		FileOutputStream fos = new FileOutputStream("D:\\b.jpg");
		
		//��������
		int b = 0;
		while ((b = fis.read()) != -1) {
			fos.write(b);
		}
		
		//�ͷ���Դ
		fis.close();
		fos.close();
		//���ֲ�����ʵ��һ��������Ҳһ�����򵥳�����������Ƶ�������ļ�Ҳ��һ���Ĳ���

	}

}
