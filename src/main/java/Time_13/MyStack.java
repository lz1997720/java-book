package Time_13;

import java.util.LinkedList;

public class MyStack {
	private LinkedList link;

	public MyStack() {
		link = new LinkedList();
	}

	public void add(Object obj) {
		link.addFirst(obj);
	}

	public Object get() {
		//return link.getFirst();//只显示第一个出栈元素
		return link.removeFirst();//移除并返回
	}

	public boolean isEmpty() {
		return link.isEmpty();
	}
}
