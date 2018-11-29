import java.awt.*;  
import java.awt.event.*;  
import java.applet.*;  
public class P28 extends Applet implements ActionListener  
{  
    TextField t1 = new TextField(20);  
    Label l1 = new Label("Enter your name: ");    
	TextField t2 = new TextField(20);  
	Button b = new Button("Show");  

    public void init()  
    {  
        add(l1);  
        add(t1);  add(t2);
        add(b);   
        b.addActionListener(this);  
    }  
    public void actionPerformed(ActionEvent e)  
    {  
        if (e.getSource() == b)  
        {  
            String name = t1.getText();  
            t2.setText("Hello " + name + "!");  
        }  
    }  
}  