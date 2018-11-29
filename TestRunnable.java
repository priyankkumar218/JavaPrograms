class AImpl implements Runnable {
	public void run() {
		System.out.println("Hello");
	}
}

public class TestRunnable {
	public static void main(String args[]) {
		AImpl a = new AImpl();
		Thread th = new Thread(a);
		th.start();
	}
}