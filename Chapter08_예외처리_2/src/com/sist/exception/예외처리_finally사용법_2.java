package com.sist.exception;
import java.sql.*;
public class 예외처리_finally사용법_2 {

	public static void main(String[] args) {
		/*
		 * 1. 오라클 연결이 가능하게 드라이버 설정
		 * 	Class.forName("드라이버")
		 * 	=>ClassNotFoundException : CheckException
		 * 2. 오라클 연동
		 * 	Connection : SQLExeption : CheckException
		 * 3. 오라클로 명령어를 전송
		 * 				----- SQL
		 * 		PreparedStatment:SQLException
		 * 4.결과값을 받는다
		 * 	ResultSet => 결과값을 메모리에 저장 
		 * --------------------------------------- finally
		 * 5. ResultSet 닫기
		 * 	PreparedStatment 닫기
		 * Connection닫기
		 * */
		
		// try => try안에서만 사용 가능 
		Connection conn = null; // 모든 데이터베이스 연결이 가능 
		// 인터페이스는 관련된 모든 클래스를 모아서 한개로 제어
		PreparedStatement ps = null;
		// 오라클 송수신 담당
		ResultSet rs = null ;
		// 결과값을 저장 
		
		try {
			String url ="jdbc:oracle:thin:@localhost:1521:XE";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2.연결
			conn = DriverManager.getConnection(url,"hr","happy");
			//3. 오라클 요청
			String sql="SELECT empno,ename,job FROM emp";
			ps = conn.prepareStatement(sql);
			// 실행후에 결과값을 가지고 온다
			rs = ps.executeQuery();
			// 결과 출력
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			
		} catch(ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		}finally {
			// 오라클 연결해제
			try {
				if(rs!=null) rs.close();
				if(ps!=null) ps.close();
				if(conn!=null) conn.close();
			} catch (Exception e) {
				
			}
		}
	}
}
