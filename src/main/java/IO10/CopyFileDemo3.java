package IO10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 需求：把c:\\a.txt内容复制到d:\\b.txt中
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
				
				//释放资源
				fw.close();
				fr.close();
		

	}

}
