package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �����쳣������ֽ����������
 * 
 * */
public class FileOutputStreamDemo4 {

	public static void main(String[] args) {
		// �ֿ����쳣����
		// FileOutputStream fos = null;
		// try {
		// fos = new FileOutputStream("fos4.txt");
		// } catch (FileNotFoundException e1) {
		// e1.printStackTrace();
		// }
		// try {
		// fos.write("java".getBytes());
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		// try {
		// fos.close();
		// } catch (IOException e) {
		// e.printStackTrace();
		// }

		// һ�����쳣����
		// try{
		// FileOutputStream fos = null;
		// fos = new FileOutputStream("fos4.txt");
		// fos.write("java".getBytes());
		// fos.close();
		// }catch(FileNotFoundException e){
		// e.printStackTrace();
		// }catch(IOException e){
		// e.printStackTrace();
		// }

		// �Ľ�
		// Ϊ����finally�����ܿ����ö���ͱ��붨�嵽���棬Ϊ�˷��ʲ������⣬���������ʼ��ֵ
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("z:\\fos4.txt");
			fos.write("java".getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// ���fos����null������Ҫclose()
			// Ϊ�˱�֤close()һ����ִ�У��ͷŵ�������
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
