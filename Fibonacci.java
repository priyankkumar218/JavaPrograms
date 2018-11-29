import java.util.Scanner;

class Fibonacci {
	public static void main(String args[]) {
		int n, t1 = 0, t2 = 1, next;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms: ");
		n = sc.nextInt();
		System.out.println("Fibonacci Series upto " + n +" terms:");
		for(int i = 1; i <= n; i++) {
			System.out.println(t1);
			next = t1 + t2;
			t1 = t2;
			t2 = next;
		}
	}
}