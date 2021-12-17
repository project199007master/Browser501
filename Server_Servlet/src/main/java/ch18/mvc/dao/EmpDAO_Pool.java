package ch18.mvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import ch18.mvc.vo.EmpDTO;

public class EmpDAO_Pool {			
	
	DataSource ds;	
	
	public EmpDAO_Pool() {
		
		try {
			Context initContext = new InitialContext();
			// lookup : 사전을 찾는다
			Context envContext  = (Context)initContext.lookup("java:/comp/env");
			ds = (DataSource)envContext.lookup("jdbc/OracleDB");
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	
	public ArrayList<EmpDTO> select(){
		
		ArrayList<EmpDTO> al = new ArrayList<EmpDTO>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select empno,ename,sal,deptno from emp";
		
		
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				al.add(new EmpDTO(rs.getInt("empno"), rs.getString("ename"), rs.getInt("sal"), rs.getInt("deptno")));
			}
			
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			
			
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return al;
		
		
	}
	
	
}
