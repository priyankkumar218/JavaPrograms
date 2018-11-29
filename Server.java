import java.io.*;
import java.net.*;

class Server {
	public static void main(String args[]) throws Exception {
		ServerSocket ss = new ServerSocket(10000);
		Socket s = ss.accept();
		DataInputStream dis = new DataInputStream(s.getInputStream());
		int r = Integer.parseInt(dis.readLine());
		PrintStream ps = new PrintStream(s.getOutputStream());
		ps.println(3.14 * r * r);
	}
}