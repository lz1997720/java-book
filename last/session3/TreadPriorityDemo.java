package session3;
/*
 * 我们现在没有设置线程的优先级，肯定有默认的优先级
 * 那么优先级是多少？
 * 如何获得线程对象优先级
 * 		public final int getPriority():返回对象的优先级
 * */
public class TreadPriorityDemo {

	public static void main(String[] args) {
		TreadPriority tp1 = new TreadPriority();
		TreadPriority tp2 = new TreadPriority();
		TreadPriority tp3 = new TreadPriority();
		
		tp1.setName("罗铮");
		tp2.setName("宋天健");
		tp3.setName("黄石峰");
		
		
//		tp1.start();
//		tp2.start();
//		tp3.start();
		
		//获取优先级
		//发现默认优先级是5
		System.out.println(tp1.getPriority());
		System.out.println(tp2.getPriority());
		System.out.println(tp3.getPriority());
		
		
		//设置优先级
		//报java.lang.IllegalArgumentException，有最小和最大优先级范围：1-10
		//tp1.setPriority(1000000000);
		tp1.setPriority(10);
		tp2.setPriority(1);
		
		//线程优先级高仅仅表示线程获取cpu的几率，但是要在次数比较多，或多次运行才能看到比较好的效果。
		
		tp1.start();
		tp2.start();
		tp3.start();
		
	}

}
