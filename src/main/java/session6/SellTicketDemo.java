package session6;
/*
 * 某电影院目前正在上映贺岁大片（红高粱，少林寺传奇），共有100张票，用它有三个售票窗口，请设计程序模拟该电影院售票
 *用继承Thread实现
 * */
public class SellTicketDemo {

	public static void main(String[] args) {
		SellTicket st1 = new SellTicket();
		SellTicket st2 = new SellTicket();
		SellTicket st3 = new SellTicket();
		
		st1.setName("窗口1");
		st2.setName("窗口2");
		st3.setName("窗口3");
		
		st1.start();
		st2.start();
		st3.start();
		
	}

}
