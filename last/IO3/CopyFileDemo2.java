package IO3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ���󣺰�c���µ�a.txt�����ݸ��Ƶ�d���µ�b.txt��
 * 
 * ����Դ��
 *     c:\\a.xtxt   --��ȡ����-- FileInputStream
 *     
 * Ŀ�ĵأ�
 * 		D:\\b.txt   --д����--   FileOutoutStream
 * */
public class CopyFileDemo2 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\a.txt");
		FileOutputStream fos = new FileOutputStream("D:\\b.txt");
		int b = 0;
		while ((b = fis.read()) != -1) {
			fos.write(b);
		}
		fis.close();
		fos.close();
	}

}
