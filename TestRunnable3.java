class ARun implements Runnable {
	@Override
	public void run() {
		for(int i=1; i<5; i++) {
			System.out.println("A"+i);
		}
	}
}

class BRun implements Runnable {
	@Override
	public void run() {
		for(int j=1; j<5; j++) {
			System.out.println("B"+j);
		}
	}
}

class CRun implements Runnable {
	@Override
	public void run() {
		for(int k=1; k<5; k++) {
			System.out.println("C"+k);
		}
	}
}

public class TestRunnable3 {
	public static void main(String args[]) {
		ARun a = new ARun();
		BRun b = new BRun();
		CRun c = new CRun();
		Thread th1 = new Thread(a);
		Thread th2 = new Thread(b);
		Thread th3 = new Thread(c);
		th1.start();
		th2.start();
		th3.start();
		th1.setPriority(1);
		th2.setPriority(th1.getPriority() + 1);
		th3.setPriority(10);
	}
}