import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentsDao {
	public static Connection getConnection() {
		Connection con = null;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager
					.getConnection("jdbc:mysql://localhost/schooldb" , "root","mysql123");

		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}

	public static List<Students> getAllStudents() {
		List<Students> list = new ArrayList<Students>();

		try {
			Connection con = StudentsDao.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from students");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Students s = new Students();
				s.setStudent_id(rs.getInt(1));
				s.setName(rs.getString(2));
				s.setClass_id(rs.getInt(3));
				list.add(s);
				
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}
}
