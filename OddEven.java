import java.util.Scanner;

class OddEven {
	public static void main(String args[]) {
		int num;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = s.nextInt();
		if(num % 2 == 0) {
			System.out.println("It's an even number.");
		} else {
			System.out.println("It's an odd number.");
		}
	}
}