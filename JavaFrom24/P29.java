import java.awt.*;  
import java.applet.*;  

public class P29 extends Applet
{  
	TextField t1, t2, t3;
    public void init()  
    {  
		t1 = new TextField(20);  
		t2 = new TextField(20);  
		t3 = new TextField(20);  
		Label l1 = new Label("Enter your name: ");
		Label l2 = new Label("Enter your course: ");
		Label l3 = new Label("Enter your marks: ");    
        add(l1);  	  
        add(t1);  
		add(l2);
		add(t2); 
		add(l3);
		add(t3);
    }  
    public void paint(Graphics g) {
		String s1, s2, s3, x, y, z;
		s1 = t1.getText();
		s2 = t2.getText();
		s3 = t3.getText();
		x = "Name: " + s1;
		y = "Course: " + s2;
		z = "Marks: " + s3;
		g.drawString(x, 200, 100);
		g.drawString(y, 200, 130);
		g.drawString(z, 200, 160);
	}
	public boolean action(Event e, Object o) 
	{
		repaint();
		return true;
	}
}  