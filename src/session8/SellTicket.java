package session8;

public class SellTicket implements Runnable{
	private int tickets = 100;
	public void run() {
		while(true){
			if(tickets > 0){
				System.out.println(Thread.currentThread().getName()+"正在出售"+(tickets--)+"张票");
			}
		}
	}

}
