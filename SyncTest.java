class BankAccount {
	int balance = 200;
	int getBalance() {
		return (balance);
	}
	void withdraw(int amount) {
		balance = balance - amount;
	}
}

class SyncTest implements Runnable {
	BankAccount b1 = new BankAccount();
	public static void main(String args[]) {
		SyncTest s1 = new SyncTest();
		Thread one = new Thread(s1);
		Thread two = new Thread(s1);
		one.setName("Ravi");
		two.setName("Samarth");
		one.start();
		two.start();
	}	
	public void run() {
		for(int i = 0; i <= 10; i++) {
			MakeWithdrawal(10);
			if(b1.getBalance() < 0) {
				System.out.println("OVER DRAWN");
			}
		}
	}
	synchronized void MakeWithdrawal(int amount) {
		if(b1.getBalance() >= amount) {
			System.out.println(Thread.currentThread().getName() + " is about to withdraw");
			try {
				System.out.println(Thread.currentThread().getName() + " is about to sleep");
				Thread.sleep(1000);
			} catch(InterruptedException ie) {
				System.out.println(ie.getMessage());	
			}
			b1.withdraw(amount);
			System.out.println("Amount left = " + b1.getBalance());
		} else {
			System.out.println("Sorry not enough");
		}
	}
}