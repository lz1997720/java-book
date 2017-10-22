package IO3;

import java.util.Arrays;

/*
 * 计算机如何识别什么时候该把两个字节转换为一个中文呢？
 * 在计算机中中文的存储分两个字符
 * 	第一个字符肯定是负数。
 * 	第二个字符常见的是负数，可能有负数，但是没有影响
 * */
public class StringDemo {

	public static void main(String[] args) {
		String s = "abcd";
		byte [] bys = s.getBytes();
		System.out.println(Arrays.toString(bys));//[97, 98, 99, 100]
		
		String ss = "时间可以治愈一切";
		byte [] byss = ss.getBytes();
		System.out.println(Arrays.toString(byss));//[-54, -79, -68, -28, -65, -55, -46, -44, -42, -50, -45, -6, -46, -69, -57, -48]
		
		//
		
		
	}

}
