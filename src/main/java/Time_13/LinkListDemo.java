package Time_13;

import java.util.Iterator;
import java.util.LinkedList;

/*
 *请用LinkedList模拟栈数据结构的集合，并测试
 *题目的意思是：
 *		你自己的定义一个集合类，在这个集合类内部可以使用LinkedList模拟。
 */
public class LinkListDemo {

	public static void main(String[] args) {
		// A: LinkedList的特有添加功能addFirst()
		// B:栈的特点先进后出
		LinkedList link = new LinkedList();

		 link.addFirst("hello");
		 link.addFirst("world");
		 link.addFirst("java");

		 Iterator it = link.iterator();
		 while (it.hasNext()) {
		 String s = (String) it.next();
		 System.out.println(s);
		 }
	}

}
