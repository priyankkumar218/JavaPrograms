import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class BLayout extends Applet {
	public void init() {
		Button b1, b2, b3, b4, b5;
		BorderLayout bl;
		bl = new BorderLayout();
		setLayout(bl);
		b1 = new Button("Button 1");
		b2 = new Button("Button 2");
		b3 = new Button("Button 3");
		b4 = new Button("Button 4");
		b5 = new Button("Button 5");
		add("North", b1); add("South", b2); 
		add("East", b3); add("West", b4);
		add("Center", b5);
	}
}