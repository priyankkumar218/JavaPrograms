abstract class Figure1 {
	double dim1;
	double dim2;
	Figure1(double d1, double d2) {
		dim1 = d1;
		dim2 = d2;
	}
	abstract double area();
}

class Rect2 extends Figure1 {
	Rect2(double l, double b) {
		super(l, b);
	}
	double area() {
		return (dim1 * dim2);
	}
}

class Tri2 extends Figure1 {
	Tri2(double s1, double s2) {
		super(s1, s2);
	}
	double area() {
		return ( (dim1 * dim2) / 2);
	}
}

public class TestArea {
	public static void main(String args[]) {
		Rect2 r2 = new Rect2(5, 6);
		Tri2 t2 = new Tri2(8, 9);
		Figure1 f1;
		f1 = r2;
		System.out.println(f1.area());
		f1 = t2;
		System.out.println(f1.area());
	}
}
	