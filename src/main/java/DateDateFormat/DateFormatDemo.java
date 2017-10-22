package DateDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Date	 --	 String(格式化)
 * 		public final String format(Date date)
 * 
 * String -- Date(解析)
 * 		public Date parse(String source)
 * 
 * DateForamt:可以进行日期和字符串的格式化和解析，但是由于是抽象类，所以使用具体子类SimpleDateFormat。
 * 
 * SimpleDateFormat的构造方法：
 * 		SimpleDateFormat():默认模式
 * 		SimpleDateFormat(String pattern):给定的模式
 * 			通过查看API找到了对应的模式
 * 			年 y
 * 			月 M	
 * 			日 d
 * 			时 H
 * 			分 m
 * 			秒 s
 * 
 * 			2017年10月22日 22:00:00
 */
public class DateFormatDemo {
	public static void main(String[] args) throws ParseException {
		// Date -- String
		Date d = new Date();
		// SimpleDateFormat sdf = new SimpleDateFormat();
		// 给定模式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		// public final String format(Date date)
		String s = sdf.format(d);
		System.out.println(s);
		
		
		//String -- Date
		String str = "2008-08-08 12:12:12";
		//在把一个字符串解析为日期的时候，请注意格式必须和给定的字符串格式匹配
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dd = sdf2.parse(str);
		System.out.println(dd);
	}
}
