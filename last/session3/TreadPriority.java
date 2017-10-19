package session3;

public class TreadPriority extends Thread {
	public TreadPriority() {

	}

	public TreadPriority(String name) {
		super(name);
	}

	public void run() {
		for (int x = 0; x < 100; x++) {
			System.out.println(getName() + ":" + x);
		}
	}
}
