class Person {
	int age; String name;
	Person(String nm, int ag) {
		name = nm;
		age = ag;
	}
	
	void display() {
		System.out.println("Name: " + name + ", Age: " + age); 
	}
}

class Student extends Person {
	int roll, marks;
	Student(String nm, int ag, int rolno, int mks) {
		super(nm, ag);
		roll = rolno;
		marks = mks;
	}
	
	void display() {
		super.display();
		System.out.println("Roll Number:  " + roll + ", Marks: " + marks);
	}
}

public class PerStu {
	public static void main(String args[]) {
		Student st = new Student("Priyank Kumar", 21, 17, 93);
		st.display();
	}
}



	
		