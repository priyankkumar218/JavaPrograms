import java.util.Scanner;

class FahCel {
	public static void main(String args[]) {
		double celcius, fahrenheit;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature (in fahrenheit): ");
		fahrenheit = sc.nextDouble();
		celcius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Temperature (in celcius) is: " + celcius);
	}
}