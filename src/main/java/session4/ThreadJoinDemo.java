package session4;
/*
 * public final void join()等待线程终止
 * */
public class ThreadJoinDemo {

	public static void main(String[] args) {
		ThreadJoin tj1 = new ThreadJoin();
		ThreadJoin tj2 = new ThreadJoin();
		ThreadJoin tj3 = new ThreadJoin();
		
		tj1.setName("罗铮");
		tj2.setName("宋天健");
		tj3.setName("黄石峰");
		
		tj1.start();
		//为了让某些线程执行完才能进行下一个线程
		try {
			tj1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		tj2.start();
		tj3.start();
		
	}

}
