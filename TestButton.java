import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class TestButton extends Applet implements ActionListener {
	Button b1, b2, b3;
	public void init() {
		b1 = new Button("Red");
		b2 = new Button("Green");
		b3 = new Button("Blue");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		add(b1); 
		add(b2);
		add(b3);
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == b1) {
			setBackground(Color.red);
		} else if(ae.getSource() == b2) {
			setBackground(Color.green);
		} else {
			setBackground(Color.blue);
		}
	}
}