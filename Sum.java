import java.util.Scanner;

class Sum {
	public static void main(String args[]) {
		int a, b, c, d;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		d = a + b + c;
		System.out.println("Sum is: " + d);
	}
}