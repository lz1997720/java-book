package IO10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * ���󣺰ѵ�ǰĿ¼�µ�a.txt���ݸ��Ƶ���ǰĿ¼�µ�c.txt��
 * ����Դ��
 * 		a.txt -- ��ȡ���� --�ַ�ת���� -- InputStreamReader
 * Ŀ�ĵأ�
 * 		b.txt -- xie'chu'shu'ju
 * 
 * */
public class CopyFileDemo {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream("a.txt"));
		
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("c.txt"));
		
		//��д����
		//��ʽһ
//		int ch =0;
//		while((ch = isr.read())!=-1){
//			osw.write(ch);
//			System.out.print((char)ch);
//		}
//		osw.flush();
		
		
		//��ʽ��
		char[]chs = new char[1024];
		int len =0;
		while((len = isr.read(chs))!=-1){
			osw.write(chs,0,len);
		}
		
		osw.close();
		isr.close();
		
	}

}
