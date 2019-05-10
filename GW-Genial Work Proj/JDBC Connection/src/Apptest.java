import java.sql.SQLException;
import java.util.List;

public class Apptest {

	public static void main(String[] args) throws SQLException {
		StudentBean sb = new StudentBean();
		sb.setid(21);
		sb.setname("Raju");
		sb.setage(22);
		sb.setemailid("raju@gmail.com");

		DBCRUDOperation dbcr = new DBCRUDOperation();

		int noOfRowsInserted = dbcr.createStudent(sb);
		System.out.println("Number of rows inserted" + noOfRowsInserted);
		
		sb.setemailid("rohit@gmail.com");
		int noOfRowsUpdated = dbcr.updateStudent(sb);
		System.out.println("Number of update rows" + noOfRowsUpdated);

		/*int noOfRowsDeleted = dbcr.deleteStudent(13);
		System.out.println("Number of deleted rows" + noOfRowsDeleted);*/

		List<StudentBean> students = dbcr.retriveStudentInfo();
		for (StudentBean student : students) {
			System.out.println(student);

		}
	}

}
