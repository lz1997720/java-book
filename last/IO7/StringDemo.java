package IO7;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
 * String [byte [] bytes ,String charsetName]:通过指定的字符集解码
 * byte[] getBytes (String charsetName):使用指定的字符集，把字符串编码为字节数
 * 
 * 编码：把看得懂的变成看不懂的
 * String -- byte[]
 * 
 * 解码：把看不懂的变成看得懂的
 * byte[] -- String 
 * 
 * 
 * 
 * 举例：谍战片（发电报，接收电报）
 * 码表：小本子
 * 		字符：数值
 * 
 * 要发送一段文字：
 * 	今天晚上在老地方见
 * 		
 * 
 * 编码问题简单，只要编码解码的格式是一致的，就不会有问题
 * 
 * */
public class StringDemo {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String s = "你好";
		
		//String -- byte
		//byte[] bys = s.getBytes();//[-60, -29, -70, -61]
		//byte[] bys = s.getBytes("GBK");//[-60, -29, -70, -61]
		byte[] bys = s.getBytes("UTF-8");
		System.out.println(Arrays.toString(bys));//[-28, -67, -96, -27, -91, -67]
		
		//byte[] -- String
		String ss = new String(bys);//你好浣犲ソ
		//String ss = new String(bys,"GBK");//你好
		//String ss = new String(bys,"UTF-8");//??? 你好
		System.out.println(ss);
		//编码不一样，解码不一样，编码一样，解码一样
		
		
		
	}

}
