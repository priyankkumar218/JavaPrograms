import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class FLayout extends Applet {
	public void init() {
		Button b1, b2, b3;
		FlowLayout flow;
		//flow = new FlowLayout(FlowLayout.LEFT, 10, 10);
		//flow = new FlowLayout(FlowLayout.RIGHT, 10, 10);
		flow = new FlowLayout(FlowLayout.CENTER, 10, 10);
		setLayout(flow);
		b1 = new Button("Button 1");
		b2 = new Button("Button 2");
		b3 = new Button("Button 3");
		add(b1); add(b2); add(b3);
	}
}