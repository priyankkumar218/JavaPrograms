import java.sql.*;
class MySQLCon {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");  
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from transactions");
			while(rs.next())  
				System.out.println("\nTransaction type: " + rs.getString(1)+"\nTransaction Amount: "+rs.getInt(2)+"\nTransaction Time: "+rs.getString(3) + "\nTransaction Category: " +rs.getString(4));  
				con.close();  
		}catch(Exception e){ System.out.println(e);}  
	}  
}  
		