package Ch23EXEC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class C03Prac {
		//자유롭게 csv파일을 받아서 mysqldb 안의 테이블로 변환후
		//jdbc 와 select 구문을 이용해서 java로 확인하기
	
	public static void main(String[] args) {
		 
		String id = "root";
		String pw = "1234";
		String url = "jdbc:mysql://localhost:3306/picturedb";
		
		Connection conn = null;						//DB연결객체용 참조변수
		PreparedStatement pstmt = null;				//SQL쿼리 전송객체용 참조변수
		ResultSet rs = null;						//쿼리결과(Select결과)수신용 참조변수
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");			//DB 드라이버 로드
			System.out.println("Driver Loading Success!!");
			conn = DriverManager.getConnection(url,id,pw); 		//DB Connection 객체 받기
			System.out.println("DB Connected...");
			pstmt=conn.prepareStatement("select * from tbl_daegu");

			rs = pstmt.executeQuery();
			if(rs != null) {
				while(rs.next()) {
					System.out.print(rs.getString("구분")+" ");
					System.out.print(rs.getString("상호")+" ");
					System.out.print(rs.getString("전화번호")+" ");
					System.out.print(rs.getString("취급제품")+" \n");
				}
			}
		}catch(Exception e) {
					e.printStackTrace();
				}finally {
					try {rs.close();}catch(Exception e) {e.printStackTrace();}
					try{pstmt.close();}catch(Exception e) {e.printStackTrace();}
					try{conn.close();}catch(Exception e) {e.printStackTrace();}
				}
			
		}
	}


