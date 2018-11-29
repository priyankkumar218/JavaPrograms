import java.sql.*;

public class MySQLIns {
	public static void main(String args[]) {
		try {
			String myDriver = "com.mysql.jdbc.Driver";
			String myUrl = "jdbc:mysql://localhost:3306/bank";
			Class.forName(myDriver);
			Connection conn = DriverManager.getConnection(myUrl, "root", "");
			String query = "INSERT INTO transactions (type, amt, category)" + "VALUES (?, ?, ?)";
			PreparedStatement preparedStmt = conn.prepareStatement(query);
			preparedStmt.setString(1, "debit");
			preparedStmt.setInt(2, 45000);
			preparedStmt.setString(3, "electronics");
			
			preparedStmt.execute();
			
			conn.close();
		} catch(Exception e){ 
			System.err.println("Got an exception!");
			System.err.println(e.getMessage());
		}
	}
}