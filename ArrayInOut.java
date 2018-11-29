import java.util.Scanner;

class ArrayInOut {
	public static void main(String args[]) {
		int a[] = new int [5] ;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the array elements: ");
		for(int i = 0; i < 5; i++) {
			a[i] = s.nextInt();
		}
		System.out.println("Array Elements: ");
		for(int i = 0; i < 5; i++) {
			System.out.println(a[i]);
		}
	}
}