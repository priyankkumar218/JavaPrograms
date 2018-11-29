import java.util.Scanner;

class CelFah {
	public static void main(String args[]) {
		double celcius, fahrenheit;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature (in celcius): ");
		celcius = sc.nextDouble();
		fahrenheit = 1.8 * celcius + 32;
		System.out.println("Temperature (in fahrenheit) is: " + fahrenheit);
	}
}