package com.foly.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

/**
 * 	MemberDAO : 데이터를 처리하는 객체 (DB처리) [박스를 갖다주면 처리해주는애들]
 * (Data Access Object)
 * 
 */
public class DAO {

	// 공통변수 선언
	private Connection con = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private String sql = "";
	
	// 디비연결 메서드 - getCon()
	private Connection getCon() throws Exception{
		// Context 객체정보 생성
		Context initCTX = new InitialContext();   //업캐스팅
		// 필요한정보(DB연결정보) 가져오기
		DataSource ds = (DataSource)initCTX.lookup("java:comp/env/jdbc/mvc6");
		// 디비 연결 
		con = ds.getConnection();
		System.out.println(" DAO : 디비연결 성공! "+con);
		
		return con;
	}
	// 디비연결 메서드 - getCon()
	
	// 디비 자원 해제 메서드 - closeDB()
	public void closeDB() {
		try {
			if(rs != null)rs.close();
			if(pstmt != null) pstmt.close();
			if(con != null)con.close();
			
			System.out.println(" DAO : 자원해제 완료! ");
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	// 디비 자원 해제 메서드 - closeDB()
	
	
	
}// DAO 
