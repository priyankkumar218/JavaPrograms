interface Exam {
	void percent_cal();
}

class Student {
	String name;
	int roll_no, mark1, mark2;
	Student(String n, int r, int m1, int m2) {
		name = n;
		roll_no = r;
		mark1 = m1;
		mark2 = m2;
	}
	void display() {
		System.out.println("Name: " + name + "\nRoll No.: " + roll_no + "\nMark 1: " + mark1 + "\nMark 2: " + mark2);
	}
}

class Result extends Student implements Exam {
	Result(String n, int r, int m1, int m2) {
		super(n, r, m1, m2);
	}
	public void percent_cal() {
		int total = (mark1 + mark2);
		double per = total * 100/200;
		System.out.println("Percentage: " + per + "%");
	}
	void display() {
		super.display();
	}
}

class MainExam {
	public static void main(String args[]) {
		Result r = new Result("Priyank Kumar", 17, 80, 98);
		r.display();
		r.percent_cal();
	}
}