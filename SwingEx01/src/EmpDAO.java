import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmpDAO {
	private Connection conn;
	
	public EmpDAO() {
		String url = "jdbc:mariadb://localhost:3306/sample";
		String user = "root";
		String password = "123456";
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			this.conn = DriverManager.getConnection( url, user, password );
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println( "[에러] : " + e.getMessage() );
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println( "[에러] : " + e.getMessage() );
		}
	}
	
	public ArrayList<EmpTO> searchEmp(String ename) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<EmpTO> emps = new ArrayList<EmpTO>();
		
		try {
			String sql = "select e.empno, e.ename, e.job, d.dname, d.loc "
					+ "from emp e inner join dept d "
					+ "on e.deptno = d.deptno " 
					+ "where ename like ?";
			pstmt = this.conn.prepareStatement(sql);
			pstmt.setString(1, ename + "%");
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmpTO to = new EmpTO();
				to.setEmpno(rs.getString("empno"));
				to.setEname(rs.getString("ename"));
				to.setJob(rs.getString("job"));
				to.setDname(rs.getString("dname"));
				to.setLoc(rs.getString("loc"));
				emps.add(to);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println( "[에러] : " + e.getMessage() );
		} finally {
			if( rs != null ) try { rs.close(); } catch( SQLException e ) {}
			if( pstmt != null ) try { pstmt.close(); } catch( SQLException e ) {}
			if( conn != null ) try { conn.close(); } catch( SQLException e ) {}		
		}
		
		return emps;
		
	}

}
