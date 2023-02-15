package jdbc04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDB {
	static Connection conn=null;
	static Statement stmt;
	static ResultSet rs;
	
	
	public static void insert(String name,String hakbun,String address) {
		
	}
	StudentDB() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/thisisjava",
				"java",
				"mysql");
		System.out.println("접속 완료");
	} 
	void delete(String name) throws SQLException {
		stmt = conn.createStatement();
		int result = stmt.executeUpdate("delete from student where di ='"+name+"'");
		System.out.printf("%s의 자료를 %d건 삭제",name,result);
	}
	

	void selectAll() throws SQLException {
		stmt = conn.createStatement();
		rs=stmt.executeQuery("select*from student");
		while(rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String hakbun = rs.getString("hakbun");
			String address = rs.getString("address");
			//...
			System.out.printf("[%d] %s %s %s\n",id,name,hakbun,address);
		}
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		StudentDB sd = new StudentDB();
		sd.delete("홍홍홍");
		sd.selectAll();
	}

}
