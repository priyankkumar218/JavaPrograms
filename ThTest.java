class A extends Thread {
	@Override
	public void run() {
		for(int i = 1; i < 50; i++)
			System.out.println(i);
	}
}

class B extends Thread {
	@Override
	public void run() {
		for(int i = 1; i < 50; i++)
			System.out.println(i);
	}
}

class C extends Thread {
	@Override
	public void run() {
		for(int i = 1; i < 50; i++)
			System.out.println(i);
	}
}

public class ThTest 
{
	public static void main(String args[]) {
		A a = new A();
		a.start();
		new B().start();
		new C().start();
	}
}