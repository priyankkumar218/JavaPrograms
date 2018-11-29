import java.util.Scanner;

class Greatest3 {
	public static void main(String args[]) {
		int a, b, c;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 3 nos:");
		a = s.nextInt(); b = s.nextInt(); c = s.nextInt();
		if ( a > b && a > c ) 
			System.out.println(a + " is greater.");
		else if ( b > a && b > c )
			System.out.println(b + " is greater.");
		else
			System.out.println(c + " is greater.");
	}
}