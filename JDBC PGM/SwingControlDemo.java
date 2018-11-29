import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
 
public class SwingControlDemo {
   private JFrame mainFrame;
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel;

   public SwingControlDemo(){
      prepareGUI();
   }
   
   public static void main(String[] args){
      SwingControlDemo  swingControlDemo = new SwingControlDemo();      
      swingControlDemo.showTextFieldDemo();
   }
   private void prepareGUI(){
      mainFrame = new JFrame("Bank Transactions");
      mainFrame.setSize(500,300);
      mainFrame.setLayout(new GridLayout(3, 1));
      
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    
      headerLabel = new JLabel("", JLabel.CENTER);        
      statusLabel = new JLabel("",JLabel.CENTER);    
      statusLabel.setSize(350,100);

      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);  
   }
   private void showTextFieldDemo(){
      headerLabel.setText("Bank Transactions"); 

      JLabel TypeLabel= new JLabel("Type: ", JLabel.RIGHT);
      JLabel AmountLabel = new JLabel("Amount: ", JLabel.CENTER);
	  JLabel categoryLabel = new JLabel("Category: ", JLabel.LEFT);
      final JTextField TypeText = new JTextField(6);
      final JTextField AmtText = new JTextField(6);      
	  final JTextField categoryText = new JTextField(6);      

      JButton saveButton = new JButton("Save");
      saveButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {  
			try {
				String myDriver = "com.mysql.jdbc.Driver";
				String myUrl = "jdbc:mysql://localhost:3306/bank";
				Class.forName(myDriver);
				Connection conn = DriverManager.getConnection(myUrl, "root", "");
				String query = "INSERT INTO transactions (type, amt, category)" + "VALUES (?, ?, ?)";
				PreparedStatement preparedStmt = conn.prepareStatement(query);
				preparedStmt.setString(1, TypeText.getText());
				preparedStmt.setInt(2, Integer.parseInt(AmtText.getText()));
				preparedStmt.setString(3, categoryText.getText());
				preparedStmt.execute();
				conn.close();
			} catch(Exception ex){ 
				System.err.println("Got an exception!");
				System.err.println(ex.getMessage());
			} finally {
				statusLabel.setText("Transaction Stored!");        
			}
        }
      }); 
      controlPanel.add(TypeLabel);
      controlPanel.add(TypeText);
      controlPanel.add(AmountLabel);       
      controlPanel.add(AmtText);
	  controlPanel.add(categoryLabel);   
	  controlPanel.add(categoryText);   
      controlPanel.add(saveButton);
      mainFrame.setVisible(true);  
   }
}