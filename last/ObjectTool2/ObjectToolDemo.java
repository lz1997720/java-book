package ObjectTool2;

public class ObjectToolDemo {

	public static void main(String[] args) {
//		ObjectTool ot = new ObjectTool();
//		ot.show("时间可以治愈一切");
//		ot.show(100);
//		ot.show(true);
		
//		ObjectTool<String> ot = new ObjectTool<String>();
//		ot.show("hello");
//		
//		ObjectTool<Integer> ot1 = new ObjectTool<Integer>();
//		ot1.show(100);
//		
//		//只能是引用类型，不能是基本类型
//		//ObjectTool<boolean> obj2 = new ObjectTool<boolean>();
//		ObjectTool<Boolean> obj2 = new ObjectTool<Boolean>();
//		obj2.show(true);
		
		//泛型类可以了
		//但是谁说了我的方法一定要和类的类型一致呢
		//我要是类上没有泛型的话，方法就不能接收住任意类型了
		
		
		//我们可以定义泛型方法
		ObjectTool ot = new ObjectTool();
		ot.show("hello");
		ot.show(100);
		ot.show(true);
		
		
		
	}

}
