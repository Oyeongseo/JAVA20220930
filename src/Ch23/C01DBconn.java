package Ch23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class C01DBconn {

	public static void main(String[] args) {
		 //연결관련 정보 저장용 변수
		String id = "root"; //DB연결 ID
		String pw = "1234";	//DB연결 PW
		String url = "jdbc:mysql:\\localhost:3306\new_shcema";
		
		Connection conn =null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		//연결하기
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loading Success");
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println("DB Connection");
			
		}catch(Exception e ){
			e.printStackTrace();
			
		}finally {
			try {conn.close();}catch(Exception e) {e.printStackTrace();}
		}
	}

}
