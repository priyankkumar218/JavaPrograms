import java.util.Scanner;

class Factorial {
	public static void main(String args[]) {
		int num, fact = 1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = s.nextInt();
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + num + " is " + fact);
	}
}