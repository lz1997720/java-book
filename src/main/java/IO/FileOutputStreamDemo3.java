package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ���ʵ�����ݵĻ��У�
 * 	Ϊʲô����û�л����أ���Ϊ��ֻд���ֽ����ݣ���û��д�뻻�з���
 *  ���ʵ���أ�д�뻻�з��ż���
 *  �ղ����ǿ�������д�ı��ļ����ǿ��Եģ�ͨ��windows�Դ����Ǹ����У�Ϊʲô�أ�
 *  ��Ϊ��ͬ��ϵͳ��Բ�ͬ�Ļ��з����ǲ�һ���ģ�
 *  windows��\r\n
 *  linux:\n
 *  Mac:\r
 *  ��һЩ�����ĸ߼����±����ǿ���ʶ���κλ��з��ŵġ�
 * 
 * ���ʵ�����ݵ�׷��д�룿
 * 		�ù��췽�����ڶ������������true��������ɡ�
 * 
 * */
public class FileOutputStreamDemo3 {

	public static void main(String[] args) throws IOException {
		// �����ֽ����������
		//FileOutputStream fos = new FileOutputStream("fos3.txt");
		//����һ�������ָ��name���ļ���д�����ݵ�����ļ���������ڶ�������Ϊtrue�����ֽ�д���ļ�ĩβ����������д���ļ���ʼ��
		FileOutputStream fos = new FileOutputStream ("fos3.txt",true);
		
		
		//д����
		for(int x = 0;x<10;x++){
			fos.write(("hello"+x).getBytes());
			fos.write("\r\n".getBytes());
		}
		
		//�ͷ���Դ
		fos.close();

	}

}
