import java.util.Scanner;

class ArrayInOut1 {
	public static void main(String args[]) {
		 String[][] countries = {
			{"India", "New Delhi"},
			{"US", "WashingtonDC"}, 
			{"Germany", "Berlin" },
			{"England", "London"}, 
			{"Russia" , "Moscow" }
		};
	
		for (int i = 0; i < countries.length; i++) {
			System.out.print("The capital of " + countries[i][0]);
				for (int j = 1; j < countries[i].length; j++) {
					System.out.print(" is " + countries[i][j] + " ");
				}
			System.out.println("\n");
		}
	}
}