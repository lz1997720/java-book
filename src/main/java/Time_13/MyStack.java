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
		//return link.getFirst();//ֻ��ʾ��һ����ջԪ��
		return link.removeFirst();//�Ƴ�������
	}

	public boolean isEmpty() {
		return link.isEmpty();
	}
}
