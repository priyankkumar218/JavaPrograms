class AThread extends Thread {
	@Override
	public void run() {
		for(int i = 1; i < 6; i++) {
			if(i == 1)
				yield();
			else 
				System.out.println(i);
		}
	}
}

class BThread extends Thread {
	@Override
	public void run() {
		for(int j = 1; j < 6; j++) {
			if(j == 3)
				stop();
			else 
				System.out.println(j);
		}
	}
}

class CThread extends Thread {
	@Override
	public void run() {
		try {
			for(int k = 1; k < 10; k++) {
				if(k == 5)
					sleep(1000);
				else 
					System.out.println(k);
			}
		} catch(InterruptedException ex) { System.out.println(ex.getMessage()); }
	}
}

public class ThThread1 {
	public static void main(String args[]) {
		AThread a = new AThread();
		a.start();
		new BThread().start();
		new CThread().start();
	}
}