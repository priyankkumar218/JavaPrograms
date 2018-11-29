import java.util.Scanner;

class Reverse {
	public static void main(String args[]) {
		int num, r = 0, d;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = s.nextInt();
		while ( num > 0 ) {
			d = num % 10;
			r = r * 10 + d;
			num = num / 10;
		}
		System.out.println("Reverse: " + r);
	}
}