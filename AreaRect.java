import java.util.Scanner;

class Rectangle {
	float len, bre;
	Rectangle(float l, float b) {
		len = l;
		bre = b;
	}	
	float area() {
		return len * bre;
	}
}

public class AreaRect {
	public static void main(String args[]) {
		float l, b;
		Scanner s = new Scanner(System.in);
		System.out.println("\nEnter the length and breadth of a rectangle: ");
		l = s.nextFloat(); b = s.nextFloat();
		Rectangle r = new Rectangle(l, b);
		System.out.println("Area of a " + l + " x " + b + " rectangle is: " + r.area()); 
	}
}