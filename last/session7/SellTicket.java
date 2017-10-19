package session7;
/*
 * 相同的票出现多次
 * 出现了负票
 * */
public class SellTicket implements Runnable{
	private int tickets = 100;
	public void run() {
		while(true){
			if(tickets > 0){
				//延迟模拟
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"正在出售"+(tickets--)+"张票");
			}
			//理想状态：管理口1正在出售第100张票，管理口2出售第二张
			//但是cpu的执行必须是一个原子性（最简单最基本的）的操作
			//先记录以前的值
			//接着tickets--
			//后输出--的值
			//tickets变成99
			//窗口1正在出售第100
			//窗口2正在出售第100
		}
	}

}
