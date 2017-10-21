package IO6;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * 字节流读取中文可能出现的小问题
 * 
 * 
 * 转换流出现的原因及思想
 * 	由于字节流操作中文不是特别方便，所以，java就提供了转换流
 * 字符流 = 字节流+编码表
 * 
 * 编码表：由现实世界的字符和对应的数值组成的一张表
 * ASC②码表，最高位为符号位，其余为数值位置
 * ISO-8859-1：拉丁码表 8位表示一个数据
 * 
 * gb2312：简体中文
 * gbk：中国的中文编码升级
 * gb18030：取代版本
 * 
 * Unicode：国际标准码，融合了多种文字。
 * 			所有文字都用两个字节表示，java语言使用的就是unicode
 * UTF—8最多用三个字节来表示一个字符
 * */
public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("a.txt");
		
//		int by = 0;
//		while((by = fis.read())!=-1){
//			System.out.print((char)by);
//		}
		
		//但是依旧不行，因为如果1023又为两个字节，那这样子还是显示不出中文
		byte[]bys = new byte[1024];
		int len = 0;
		while((len = fis.read(bys))!=-1){
			System.out.println(new String(bys,0,len));
		}
		
		fis.close();
		
	}

}
