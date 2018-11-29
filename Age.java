import java.util.Scanner;

class AgeException extends Exception {
	String msg;
	AgeException(String m) {
		msg = m;
	}
	public String toString() {
		return ("Exception: " + msg);
	}
}

class Age {
	public static void main(String args[]) throws AgeException {
		Scanner s = new Scanner(System.in);
		int age;
		try {
			System.out.println("Enter your age: ");
			age = s.nextInt();
			if(age < 18) 
				throw new AgeException("You aren't eligible to vote.");
		} catch(AgeException ae) {
			System.out.println(ae);
			System.out.println("Enter your age: ");
			age = s.nextInt();
			System.out.println(age);
		}
	}
}