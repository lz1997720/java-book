package ObjectTool1;
/*
 * 泛型类的测试
 * */
public class ObjectToolDemo {

	public static void main(String[] args) {
		ObjectTool ot = new ObjectTool();
		ot.setObj(new String ("罗铮"));
		String s = (String)ot.getObj();
		System.out.println("姓名是："+s);
		ot.setObj(new Integer (20));
		Integer i = (Integer)ot.getObj();
		System.out.println("年龄是："+i);
		
//		ot.setObj(new String ("宋天健"));
//		//java.lang.ClassCastException
//		Integer ii = (Integer)ot.getObj();
//		System.out.println("姓名是："+ii);
		
		System.out.println("---------------------");
		
		ObjectTool<String> ots = new ObjectTool<String>();
		//ot.setObj(new Integer(20));//这个时候编译期间就过不去
		ots.setObj(new String("罗铮"));
		System.out.println("姓名是："+ots.getObj());
		
		ObjectTool<Integer> ots2 = new ObjectTool<Integer>();
		//ots2.setObj("罗铮");
		ots2.setObj(20);
		System.out.println("年龄是："+ots2.getObj());
	}

}
