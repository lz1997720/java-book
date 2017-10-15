package session4;
/*
 * public static void yield();
 * */
public class ThreadYieldDemo {

	public static void main(String[] args) {
		ThreadYield ty1 = new ThreadYield();
		ThreadYield ty2 = new ThreadYield();
		
		ty1.setName("罗铮");
		ty2.setName("三千");
	
		ty1.start();
		ty2.start();
	}

}
