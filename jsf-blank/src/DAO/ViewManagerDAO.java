package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ViewManagerDAO {
	public static Boolean viewmanager(String username) {
		// TODO Auto-generated method stub
		try {
			DatabaseConnection db = new DatabaseConnection();
			Connection con = db.createConnection();
			Statement statement = con.createStatement();
			ResultSet rest = statement
					.executeQuery("select username from managers");
			if (rest.next())
				return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}

}
