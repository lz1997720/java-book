package IO10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * �������ǳ����Ĳ�������ʹ�ñ���Ĭ�ϵı��룬���ԣ�����ָ������
 * ��ת�����������е㳪�����ԣ�java���ṩ�������๩����ʹ�á�
 * OutputStreamWriter = FileOutputStream+�����GBK
 * FileWriter = FileInputStream+�����GBK
 * 
 * InputStreamReader = FileInputStream + �����(GBK)
 * FileReader = FileInputStream + �����(GBK)
 * 
 * ���󣺰ѵ�ǰ��ĿĿ¼�µ�a.txt���ݸ��Ƶ���ǰ��ĿĿ¼�µ�b.txt��
 * ����Դ��
 * 		a.txt -- ��ȡ���� -- �ַ�ת���� -- InputStreamReader -- FileReader
 * Ŀ�ĵأ�
 * 		b.txt -- д������ -- �ַ�ת���� -- OutputStreamWriter -- FileWriter
 * */
public class CopyFileDemo2 {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("a.txt");
		
		FileWriter fw = new FileWriter("b.txt");
		
//		int ch = 0;
//		while ((ch = fr.read()) != -1) {
//			 fw.write(ch);
//			 System.out.print((char)ch);
//		}
//		fw.flush();
		
		// һ��һ���ַ�����
				char[] chs = new char[1024];
				int len = 0;
				while ((len = fr.read(chs)) != -1) {
					fw.write(chs, 0, len);
				}
				fw.flush();
				
				fw.close();
				fr.close();
	}

}
