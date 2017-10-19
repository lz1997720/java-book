package session4;

import java.util.Date;

public class ThreadDaemon extends Thread{
	public void run(){
		for(int x = 0; x<200;x++){
			System.out.println(getName()+":"+x+",日期："+new Date());
		}
	}
}
