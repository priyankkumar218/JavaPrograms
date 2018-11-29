import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class TestMove extends Applet implements MouseListener {
	String msg = "";
	int x = 0, y = 0;
	public void init() {
		addMouseListener(this);
	}
	public void mouseClicked(MouseEvent me) { } 
	public void mouseEntered(MouseEvent me) { }
	public void mouseExited(MouseEvent me) { }
	public void mousePressed(MouseEvent me) {
		x = me.getX();
		y = me.getY();
		msg = "Mouse Down";
		repaint();
	}
	public void mouseReleased(MouseEvent me) {
		x = me.getX();
		y = me.getY();
		msg = "Mouse Up";
		repaint();
	}
	public void paint(Graphics g) {
		g.drawString(msg, x, y);
	}
}