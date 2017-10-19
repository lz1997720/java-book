package session4;

import java.util.Date;

public class ThreadSleep extends Thread{
	public void run(){
		for(int x = 0; x<100;x++){
			System.out.println(getName()+":"+x+",日期："+new Date());
			//睡眠
			//困了，我稍微休息一分钟
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
