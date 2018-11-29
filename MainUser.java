import java.util.Scanner;

class Student {
	int rollno;
	String name;
	float marks;
	Student(int rno, String nm, float mks) {
		rollno = rno;
		name = nm;
		marks = mks;
	}	
	void display() {
		System.out.println(rollno + " " + name + " " + marks);
	}
}

public class MainUser {
	public static void main(String args[]) {
		String na; int roll; float ma;
		Scanner s = new Scanner(System.in);
		System.out.println("\nEnter the roll number, name, marks for the first student: ");
		roll =  s.nextInt(); na = s.next(); ma = s.nextFloat();
		Student s1 = new Student(roll, na, ma);
		System.out.println("\nEnter the roll number, name, marks for the second student: ");
		roll =  s.nextInt(); na = s.next(); ma = s.nextFloat();
		Student s2 = new Student(roll, na, ma);
		s1.display(); s2.display();
	}
}