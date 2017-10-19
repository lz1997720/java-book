package session4;
/*
 * 线程的休眠
 * */
public class ThreadSleepDemo {
	public static void main(String[] args){
		ThreadSleep ts1 = new ThreadSleep();
		ThreadSleep ts2 = new ThreadSleep();
		ThreadSleep ts3 = new ThreadSleep();
		
		ts1.setName("罗铮");
		ts2.setName("宋天健");
		ts3.setName("黄石峰");
		
		ts1.start();
		ts2.start();
		ts3.start();
	}
}
