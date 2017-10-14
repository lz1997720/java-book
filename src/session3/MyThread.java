package session3;
/*
 * 该类要重写run()方法
 * 不是类中的所有代码都需要被线程执行。
 * 而这个时候，为了区分哪些代码能够被线程执行，java提供了run()这个方法用来包含那些被线程执行的方法
 * 
 * */

public class MyThread extends Thread{
	
	public MyThread(){
		
	}
	
	public MyThread(String name){
		super(name);
	}
	
	public void run() {
		//System.out.println("java线程");
		//一般来说被线程执行的代码肯定是比较耗时间的，不是这种简单的代码
		for(int x = 0;x<200;x++){
			/*
			 * 如何获取线程对象的名称：
			 * 		public final String getName();
			 * */
			System.out.println(getName()+"   "+x);
		}
		
		/*
		 * 名称中为什么是：Thread-? 编号
		 Class Thread(){
		 private char name[];
		 	public Thread(){
		 		init(null,null,"Thread-"+nextThreadNum(),0);
		 	}
		 }
		 
		 private static int threadInitNumber;//0,1
		 private static synchronized int nextTreadNum(){
		  return threadInitNumber++;//return 0;
		 }
		 
		 public final String getName(){
		 	return String.valueOf(name);
		 }
		 
		 * */
		
	}
}
