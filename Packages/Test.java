package p1;

import calculator.Calculate;

public class Test {
	public static void main(String args[]) {
		Calculate c = new Calculate();
		System.out.println(c.addnos(1, 2) + " " + c.subnos(3, 1) + " " + c.mulnos(3, 2) + " " + c.divnos(6, 2));
	}
}