package ObjectTool1;
/*
 * ������Ĳ���
 * */
public class ObjectToolDemo {

	public static void main(String[] args) {
		ObjectTool ot = new ObjectTool();
		ot.setObj(new String ("���"));
		String s = (String)ot.getObj();
		System.out.println("�����ǣ�"+s);
		ot.setObj(new Integer (20));
		Integer i = (Integer)ot.getObj();
		System.out.println("�����ǣ�"+i);
		
//		ot.setObj(new String ("���콡"));
//		//java.lang.ClassCastException
//		Integer ii = (Integer)ot.getObj();
//		System.out.println("�����ǣ�"+ii);
		
		System.out.println("---------------------");
		
		ObjectTool<String> ots = new ObjectTool<String>();
		//ot.setObj(new Integer(20));//���ʱ������ڼ�͹���ȥ
		ots.setObj(new String("���"));
		System.out.println("�����ǣ�"+ots.getObj());
		
		ObjectTool<Integer> ots2 = new ObjectTool<Integer>();
		//ots2.setObj("���");
		ots2.setObj(20);
		System.out.println("�����ǣ�"+ots2.getObj());
	}

}
