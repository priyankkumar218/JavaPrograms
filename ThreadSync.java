class MyThread2 extends Thread {
	String msg[]={"I", "Love", "Java", "very", "much"};
	public MyThread2(String name) {
		super(name);
	}
	public void run() {
		display(msg);
	}
	synchronized void display(String list[]) {
		for(int i=0; i<list.length; i++) {
			System.out.println(Thread.currentThread().getName()+":"+list[i]);
		}
	}
}

class ThreadSync {
	public static void main(String args[]) {
		MyThread2 t1 = new MyThread2("one");
		MyThread2 t2 = new MyThread2("two");
		t1.start();
		t2.start();
	}
}