package pfpackage2;

public class GradeCheck {
	public String GradeCheckFun(int mks) {
		if(mks >= 50 && mks <= 60) 
			return "C";
		else if(mks >= 61 && mks <= 70)
			return "B";
		else
			return "A";
	}
}
			