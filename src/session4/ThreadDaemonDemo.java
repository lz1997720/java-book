package session4;

import java.util.Date;

/*
 * public final void setDaemon(boolean on);该线程标记为守护线程或用户线程。
 * 当正在运行的线程都是守护线程时，java虚拟机退出。该方法必须在启动线程前调用
 * */
public class ThreadDaemonDemo {
	public static void main(String[] args) {
		ThreadDaemon td1 = new ThreadDaemon();
		ThreadDaemon td2 = new ThreadDaemon();

		td1.setName("关羽");
		td2.setName("张飞");

		// 设置守护线程
		td1.setDaemon(true);
		td2.setDaemon(true);

		td1.start();
		td2.start();

		Thread.currentThread().setName("刘备");
		for (int x = 0; x < 1; x++) {
			System.out.println(Thread.currentThread().getName());
		}

	}
}
