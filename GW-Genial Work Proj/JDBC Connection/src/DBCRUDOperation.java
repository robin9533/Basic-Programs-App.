
//import java.nio.channels.SelectableChannel;
import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBCRUDOperation {

	public int createStudent(StudentBean Student) throws SQLException {
		Connection conn = DBConnectionTest.getConnection();
		// PreparedStatement pstmt;
		Statement stmt = null;
		int noOfRowsInserted = 0;

		try {

			stmt = conn.createStatement();
			String query = "INSERT into user_tbl VALUES('" + Student.getid() + "','" + Student.getname() + "','"
					+ Student.getage() + "','" + Student.getemailaddress() + "')";
			/*
			 * pstmt = conn.prepareStatement(query); pstmt.setInt(1, Student.getid());
			 * pstmt.setString(2, Student.getname()); pstmt.setInt(3, Student.getage());
			 * pstmt.setString(4, Student.getemailaddress()); ResultSet rs =
			 * pstmt.executeQuery();
			 */

			noOfRowsInserted = stmt.executeUpdate(query);

			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return noOfRowsInserted;
	}

	public int updateStudent(StudentBean Student) throws SQLException {
		Connection conn = DBConnectionTest.getConnection();
		Statement stmt = null;
		// PreparedStatement pstmt;
		int noOfRowsUpdated = 0;

		try {
			stmt = conn.createStatement();
			String updatequery = "Update user_tbl SET id = 40 WHERE id=20";
			noOfRowsUpdated = stmt.executeUpdate(updatequery);

			/*
			 * pstmt = conn.prepareStatement(updatequery); pstmt.setInt(1, Student.getid());
			 * pstmt.setString(2, Student.getname()); pstmt.setInt(3, Student.getage());
			 * pstmt.setString(4, Student.getemailaddress()); noOfRowsUpdated =
			 * pstmt.executeUpdate();
			 */

			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return noOfRowsUpdated;
	}

	public int deleteStudent(int studentid) throws SQLException {
		Connection conn = DBConnectionTest.getConnection();
		// PreparedStatement pstmt;
		Statement stmt = null;
		int noOfRowsDeleted = 0;

		try {
			stmt = conn.createStatement();
			String deletequery = "delete from user_tbl WHERE id=" + studentid+ "";

			/*
			 * pstmt = conn.prepareStatement(deletequery);
			 * 
			 * pstmt.setInt(1, studentid); noOfRowsDeleted = pstmt.executeUpdate();
			 */
			noOfRowsDeleted = stmt.executeUpdate(deletequery);
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return noOfRowsDeleted;
	}

	public List<StudentBean> retriveStudentInfo() throws SQLException {
		List<StudentBean> studentlist = new ArrayList<>();
		Statement stm;
		ResultSet rs;

		Connection connet = DBConnectionTest.getConnection();
		stm = connet.createStatement();
		rs = stm.executeQuery("Select * from user_tbl");
		try {
			while (rs.next()) {
				StudentBean sb = new StudentBean();
				sb.setid(rs.getInt(1));
				sb.setname(rs.getString(2));
				sb.setage(rs.getInt(3));
				sb.setemailid(rs.getString(4));
				studentlist.add(sb);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return studentlist;
	}

}
