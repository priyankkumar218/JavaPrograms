package pfpackage3;

import pfpackage.*; 
import pfpackage2.*; 
import java.util.*;

public class MainOne {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		PassFail pf = new PassFail();
		if(pf.pfcheck(m) == 1) {
			System.out.println("Fail");
		} else {
			GradeCheck gc = new GradeCheck();
			String gr = gc.GradeCheckFun(m);
			System.out.println("Passed with: " + gr + " grade.");
		}
	}
}
			