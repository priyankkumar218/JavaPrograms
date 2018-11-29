import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.util.*;

public class LoginView implements ActionListener {
	JLabel userLabel, passwordLabel;
	JTextField userText;
	JPasswordField passwordText;
	JButton loginButton, resetButton;
	Map m1;
	public static void main(String args[]) {
		JFrame frame =  new JFrame("Demo application");
		frame.setSize(300, 190);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		frame.add(panel);
		LoginView ob = new LoginView();
		ob.mapinit();
		ob.placeComponents(panel);
		frame.setVisible(true);
	}
	public void mapinit() {
		System.out.println("Hello!");
		m1 = new HashMap();
		m1.put("John", "Password");
		m1.put("Mark", "Secret");
	}
	private void placeComponents(JPanel panel) {
		panel.setLayout(null);
		userLabel = new JLabel("User");
		userLabel.setBounds(10, 10, 80, 25);
		panel.add(userLabel);
		userText = new JTextField(20);
		userText.setBounds(100, 10, 160, 25);
		panel.add(userText);
		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 40, 80, 25);
		panel.add(passwordLabel);
		passwordText = new JPasswordField(20);
		passwordText.setBounds(100, 40, 160, 25);
		panel.add(passwordText);
		loginButton = new JButton("Login");
		loginButton.setBounds(180, 80, 80, 25);
		panel.add(loginButton);
		resetButton = new JButton("Reset");
		resetButton.setBounds(180, 120, 80, 25);
		panel.add(resetButton);
		resetButton.addActionListener(this);
		loginButton.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		String str = ae.getActionCommand();
		if(str.equals("Reset")) {
			userText.setText("");
			passwordText.setText("");
		} else {
			String user = userText.getText();
			String password = passwordText.getText();
			String pass = (String) m1.get(user);
			if(password.equals(pass))
				JOptionPane.showMessageDialog(null, "Login Successful");
			else
				JOptionPane.showMessageDialog(null, "Login Fails");
		}
	}
}