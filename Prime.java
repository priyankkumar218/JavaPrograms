import java.util.Scanner;

class Prime {
	public static void main(String args[]) {
		int num, f = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = s.nextInt();
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				f = 1;
			}
		}
		if(f==0) {
			System.out.println("Number is prime");
		} else {
			System.out.println("Not a prime number");
		}
	}
}