class Room {
	int len, bre;
	Room(int l, int b) {
		len = l;
		bre = b;
	}
	
	void area() {
		System.out.println(len * bre);
	}
	
	void display() {
		System.out.println("Length: " + len + ", Breadth: " + bre); 
	}
}

class DRoom extends Room {
	int height;
	DRoom(int l, int b, int h) {
		super(l, b);
		height = h;
	}
	
	void volume() {
		System.out.println(len * bre * height);
	}
	
	void display() {
		super.display();
		System.out.println(", Height: " + height);
	}
}

public class TestRoom {
	public static void main(String args[]) {
		DRoom droom = new DRoom(5, 6, 8);
		droom.display();
		droom.area();
		droom.volume();
	}
}



	
		