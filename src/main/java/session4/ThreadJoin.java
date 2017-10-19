package session4;

import java.util.Date;

public class ThreadJoin extends Thread{
	public void run(){
		for(int x = 0; x<100;x++){
			System.out.println(getName()+":"+x+",日期："+new Date());
		}
	}
}
