package IO10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * ���󣺰�c:\\a.txt���ݸ��Ƶ�d:\\b.txt��
 * 
 * 
 * 
 * */
public class CopyFileDemo3 {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("c:\\a.txt");
		
		FileWriter fw = new FileWriter("d:\\b.txt");
		
				int ch;
				while ((ch = fr.read()) != -1) {
					fw.write(ch);
				}
				
				//�ͷ���Դ
				fw.close();
				fr.close();
		

	}

}
