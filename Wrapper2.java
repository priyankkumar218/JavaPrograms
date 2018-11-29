public class Wrapper2 {
	public static void main(String ags[]) {
		//Converting Integer to int
		Integer num = new Integer(45);
		//Converting Integer to int
		int i = num.intValue(); 
		int j = num; //unboxing
		System.out.println(num+" "+i+" "+j);
	}
}