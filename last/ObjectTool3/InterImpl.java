package ObjectTool3;

//ʵ������ʵ�ֽӿڵ�ʱ��
//��һ��������Ѿ�֪����ʲô���͵���
//public class InterImpl implements Inter<String>{
//
//	public void show(String t) {
//		System.out.println(t);
//	}
//	
//}

//�ڶ������������֪����ʲô���͵ģ��õ�ʱ�����֪��
//�ڶ������������֪����ʲô���͵�
public class InterImpl<T> implements Inter<T> {
	public void show(T t) {
		System.out.println(t);
	}
}
