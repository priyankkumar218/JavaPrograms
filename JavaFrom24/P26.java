import java.awt.*;  
import java.awt.event.*;  
import java.applet.*;  
public class P26 extends Applet implements ActionListener  
{  
    TextField t1 = new TextField(7);  
    TextField t2 = new TextField(7);  
    TextField t3 = new TextField(7);  
    Label l1 = new Label("First Number:");  
    Label l2 = new Label("Second Number:");  
    Label l3 = new Label("Result:");  
    Button b = new Button("Add");  
	Button b1 = new Button("Sub");  
	Button b2 = new Button("Mul");
	Button b3 = new Button("Div");  
	
    public void init()  
    {  
        add(l1);  
        add(t1);  
        add(l2);  
        add(t2);  
        add(l3);  
        add(t3);  
        add(b);  add(b1);  add(b2);  add(b3);  
        b.addActionListener(this);  
		b1.addActionListener(this);  
		b2.addActionListener(this);  b3.addActionListener(this);  
    }  
    public void actionPerformed(ActionEvent e)  
    {  
        if (e.getSource() == b)  
        {  
            int n1 = Integer.parseInt(t1.getText());  
            int n2 = Integer.parseInt(t2.getText());  
            t3.setText(" " + (n1 + n2));  
        }  
		else if(e.getSource() == b1)
		{
			int n1 = Integer.parseInt(t1.getText());  
            int n2 = Integer.parseInt(t2.getText());  
            t3.setText(" " + (n1 - n2));  
		}
		else if(e.getSource() == b2)
		{
			int n1 = Integer.parseInt(t1.getText());  
            int n2 = Integer.parseInt(t2.getText());  
            t3.setText(" " + (n1 * n2));  
		}
		else if(e.getSource() == b3)
		{
			int n1 = Integer.parseInt(t1.getText());  
            int n2 = Integer.parseInt(t2.getText());  
            t3.setText(" " + (n1 / n2));  
		}
    }  
}  