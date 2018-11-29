import java.io.*;
import java.net.*;

class Client {
	public static void main(String args[]) throws Exception {
		Socket s = new Socket(InetAddress.getLocalHost(), 10000);
		System.out.println("Enter the radius of the circle: ");
		DataInputStream dis = new DataInputStream(System.in);
		int n = Integer.parseInt(dis.readLine());
		PrintStream ps = new PrintStream(s.getOutputStream());
		ps.println(n);
		DataInputStream dis1 = new DataInputStream(s.getInputStream());
		System.out.println("Area of circle from server: " + dis1.readLine());
	}
}