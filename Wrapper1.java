public class Wrapper1 {
	public static void main(String ags[]) {
		int num = 20;
		//Converting int into Integer
		Integer i = Integer.valueOf(num);
		//Autoboxing
		Integer j = num;
		System.out.println(num+" "+i+" "+j);
	}
}