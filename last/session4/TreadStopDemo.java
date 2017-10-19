package session4;

import java.util.Date;

/*
 * public final void stop();让线程停止，过时了，但是还可以使用.
 * public void interrupt();中断线程,把线程的状态终止并爆出一个InterruptedException。
 * */
public class TreadStopDemo {

	public static void main(String[] args) {
		ThreadStop ts1 = new ThreadStop();
		ts1.start();
		
		//设置超过3秒不运行就毁掉后面部分
		try {
			Thread.sleep(3000);
			//ts1.stop();
			ts1.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
