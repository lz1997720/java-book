package Time_05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 需求：存储字符串并遍历。
 * 
 * 分析：
 * 		A:创建集合对象
 * 		B:创建字符串对象
 * 		C:把字符串对象添加到集合中
 * 		D:遍历集合
 */
public class CollectionTest {

	public static void main(String[] args) {
		Collection c = new ArrayList();

		c.add("罗铮");
		c.add("宋天健");
		c.add("徐培源");
		c.add("彭家辉");
		c.add("孙昊");

		Iterator it = c.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}
	}

}
