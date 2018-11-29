import java.awt.*;
import java.applet.*;

public class UserIn extends Applet {
	TextField t1,t2;
	public void init() 
	{	
		t1 = new TextField(8);
		t2 = new TextField(8);
		add(t1); add(t2);
		t1.setText("0");
		t2.setText("0");
	}
	public void paint(Graphics g) {
		int x = 0, y = 0, z = 0;
		String s1, s2, s;
		g.drawString("Input a number in each box", 10, 50);
		try 
		{
			s1 = t1.getText();
			x = Integer.parseInt(s1);
			s2 = t2.getText();
			y = Integer.parseInt(s2);
		} catch (Exception ex) { }
		z = x + y;
		s = String.valueOf(z);
		g.drawString("THE SUM IS: ", 10, 75);
		g.drawString(s, 100, 75);
	}
	public boolean action(Event e, Object o) 
	{
		repaint();
		return true;
	}
}