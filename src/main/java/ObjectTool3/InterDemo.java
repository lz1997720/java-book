package ObjectTool3;

public class InterDemo {

	public static void main(String[] args) {
		// ��һ������Ĳ���
		// Inter<Integer> i= new InterImpl();
		// Inter<String> i= new InterImpl();
		// i.show("hello");

		// // �ڶ�������Ĳ���
		Inter<String> i = new InterImpl<String>();
		i.show("hello");

		Inter<Integer> ii = new InterImpl<Integer>();
		ii.show(100);

	}

}
