package ch18.mvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ch18.mvc.vo.EmpDTO;

public class EmpDAO {	
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	public EmpDAO() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 이상");
		} 
		
	}
	
	public ArrayList<EmpDTO> select(){
		
		ArrayList<EmpDTO> al = new ArrayList<EmpDTO>();
		
		String sql = "select empno,ename,sal,deptno from emp";
		
		
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				al.add(new EmpDTO(rs.getInt("empno"), rs.getString("ename"), rs.getInt("sal"), rs.getInt("deptno")));
			}
			
			return al;
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
			
		}
		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	public void connectDB() {
		try {
			
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			conn = DriverManager.getConnection(url, "scott", "scott");
		}
		 catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
