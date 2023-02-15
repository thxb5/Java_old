package chap05_2;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;


public class TryEx {

	public static void main(String[] args)  {
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/thisisjava",
					"java",
					"mysql");
			
			System.out.println("연결 성공");
		}
		
		
	
				
	
	}
}
