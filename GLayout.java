import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class GLayout extends Applet {
	public void init() {
		Button b1, b2, b3, b4;
		GridLayout g1;
		g1 = new GridLayout(2, 2);
		setLayout(g1);
		b1 = new Button("Button 1");
		b2 = new Button("Button 2");
		b3 = new Button("Button 3");
		b4 = new Button("Button 4");
		add(b1); add(b2); add(b3); add(b4);
	}
}