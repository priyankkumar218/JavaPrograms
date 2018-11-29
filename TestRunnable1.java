class MovieThread extends Thread {
	String str;
	MovieThread(String s) {
		this.str = s;
	}
	public void run() {
		System.out.println(str);
	}
}

public class TestRunnable1 {
	public static void main(String args[]) {
		MovieThread m1 = new MovieThread("Cut the ticket");
		MovieThread m2 = new MovieThread("Show the ticket");
		Thread th1 = new Thread(m1);
		Thread th2 = new Thread(m2);
		th1.start();
		try {
			Thread.sleep(1000);
		} catch(InterruptedException ex) {}
		th2.start();
	}
}