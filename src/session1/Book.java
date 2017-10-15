package session1;

public class Book {
	boolean checkedOut = false;
	Book(boolean checkOut){
		this.checkedOut = checkOut;
	}
	void checkIn(){
		checkedOut = false;
	}
	protected void finalize() throws Throwable{
		if(checkedOut = false)
			System.out.println("Error:checked out");
			//??????????????
		try {
			super.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String [] args){
		Book novel = new Book(true);
		novel.checkIn();
		new Book(true);
		System.gc();
	}
}
