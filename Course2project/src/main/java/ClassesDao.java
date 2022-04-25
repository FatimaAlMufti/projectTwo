import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClassesDao {
	public static Connection getConnection() {
		Connection con = null;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/schooldb", "root", "mysql123");

		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}

	public static List<Classes> getAllClasses() {
		List<Classes> list = new ArrayList<Classes>();

		try {
			Connection con = ClassesDao.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from classes");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Classes c = new Classes();
				c.setClass_id(rs.getInt(1));
				c.setSection(rs.getString(2));
				c.setSubject(rs.getInt(3));
				c.setTeacher(rs.getInt(4));
				list.add(c);

			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

}