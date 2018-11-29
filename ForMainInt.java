interface Figure {
	public abstract float area(float a, float b);
}

interface CircleFig {
	public final static float PI  = 3.142F;
	public abstract float area(float a);
}

class Rect1 implements Figure {
	public float area(float m, float n) {
		return (m * n);
	}
}

class Tri1 implements Figure {
	public float area(float x, float y) {
		return (x * y / 2);
	}
}

class Circ1 implements CircleFig {
	public float area(float r) {
		return (PI * r * r);
	}
}

class ForMainInt {
	public static void main(String [] args) {
		Rect1 r = new Rect1();
		Tri1 t = new Tri1();
		Circ1 c = new Circ1();
		Figure fig;
		fig = r;
		System.out.println(fig.area(2, 3));
		fig = t;
		System.out.println(fig.area(4, 5));
		CircleFig cf;
		cf = c;
		System.out.println(cf.area(8));
	}
}