package session6;

public class SellTicket extends Thread{
	private  static int tickets = 100;//定义一百张票
	public void run() {
		//循环
		while(true){
			if(tickets>0){
				System.out.println(getName()+"正在出售"+(tickets--)+"张票");
			}
		}
	}

}
