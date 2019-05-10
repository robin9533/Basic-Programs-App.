import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;;

public class DBConnection {

	public static void main(String[] args) throws SQLException {
			
				try {
					Class.forName("com.mysql.jdbc.Driver");
			
				Connection connet = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test","root","asd123!@#");
				Statement stm  = connet.createStatement();
				String query =  "insert into user_tbl VALUES(10,'Rohit' , 20 , 'rohit@gmail.com')";
				stm.executeUpdate(query);
				
				ResultSet rs = stm.executeQuery("select * from user_tbl");
				
				while(rs.next()) {
					System.out.println(rs.getInt(1)+ " " + rs.getInt(2)+ " " + rs.getInt(3));
				}
				
				connet.close();
				}
	
	catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("Error 1");
		return;
	}
		catch (SQLException e) {
			System.out.println("Error 2");
			e.printStackTrace();
			return;
				}
				
	}	
				
}



	
	
