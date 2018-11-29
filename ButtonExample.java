import java.awt.event.*;  
import javax.swing.*;    
public class ButtonExample {  
	public static void main(String[] args) {  
		JFrame f=new JFrame("Button Example");  
		final JTextField tf=new JTextField();  
		tf.setBounds(50,50, 150,20);  
		JButton b=new JButton("Show");  
		b.setBounds(50,100,95,30);  
		JLabel l1 = new JLabel("");
		l1.setBounds(50, 150, 95, 30);
		b.addActionListener(new ActionListener(){  
		public void actionPerformed(ActionEvent e){  
				String name = tf.getText();
				l1.setText("Hello, " + name);
			}  
		});  
		f.add(b);f.add(tf); f.add(l1); 
		f.setSize(400,400);  
		f.setLayout(null);  
		f.setVisible(true);   
	}  
}  