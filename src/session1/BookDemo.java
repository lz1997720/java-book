package session1;

public class BookDemo {

	public static void main(String [] args){
		Book novel = new Book(true);
		novel.checkIn();
		novel = null;
		System.gc();
	}

}
