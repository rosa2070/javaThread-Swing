package com.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeDAO {
	private Connection conn;
	
	public EmployeeDAO() {
		// TODO Auto-generated constructor stub
		
		String url = "jdbc:mariadb://localhost:3306/sample";
		String user = "root";
		String password = "123456";
		
		try {
			Class.forName( "org.mariadb.jdbc.Driver" );
			this.conn = DriverManager.getConnection( url, user, password );
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println( "[에러] : " + e.getMessage() );
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println( "[에러] : " + e.getMessage() );
		}
	}
	
	public ArrayList<EmployeeTO> listDeptno() {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<EmployeeTO> lists = new ArrayList<EmployeeTO>();
		
		try {
			String sql = "select distinct deptno from emp";
			pstmt = conn.prepareStatement( sql );
			
			rs = pstmt.executeQuery();
			while( rs.next() ) {
				EmployeeTO to = new EmployeeTO();
				to.setDeptno( rs.getString( "deptno" ) );
				
				lists.add( to );
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
		} finally {
			if( rs != null ) try { rs.close(); } catch( SQLException e ) {}
			if( pstmt != null ) try { pstmt.close(); } catch( SQLException e ) {}
			if( conn != null ) try { conn.close(); } catch( SQLException e ) {}
		}
		return lists;
	}
	
//	public ArrayList<EmployeeTO> listEmployee(EmployeeTO to) {
	public ArrayList<EmployeeTO> listEmployee(String deptno) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<EmployeeTO> lists = new ArrayList<EmployeeTO>();
		
		try {
			String sql = "select empno, ename, job, mgr, hiredate, sal, comm from emp where deptno = ?";
			pstmt = conn.prepareStatement( sql );
			pstmt.setString(1, deptno);
			
			rs = pstmt.executeQuery();
			while( rs.next() ) {
				EmployeeTO to = new EmployeeTO();
				to.setEmpno(rs.getString("empno"));
				to.setEname(rs.getString("ename"));
				to.setJob(rs.getString("job"));
				to.setMgr(rs.getString("mgr"));
				to.setHiredate(rs.getString("hiredate"));
				to.setSal(rs.getString("sal"));
				to.setComm(rs.getString("comm"));
				
				lists.add( to );
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println( "[에러] : " + e.getMessage() );
		} finally {
			if( rs != null ) try { rs.close(); } catch( SQLException e ) {}
			if( pstmt != null ) try { pstmt.close(); } catch( SQLException e ) {}
			if( conn != null ) try { conn.close(); } catch( SQLException e ) {}
		}
		return lists;
		
	}
}








