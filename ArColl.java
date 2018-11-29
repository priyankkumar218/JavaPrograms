import java.util.ArrayList;

public class ArColl {
	public static void main(String args[]) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(100);
		numbers.add(40);
		numbers.add(230);
		numbers.add(50);
		//Retrieving values
		System.out.println(numbers.get(0));
		//Iteration 1
		for(int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		//Removing items from the list
		numbers.remove(0); //Pretty Slow
		numbers.remove(numbers.size() - 1);
		//Iteration 2
		for(int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
	}
}