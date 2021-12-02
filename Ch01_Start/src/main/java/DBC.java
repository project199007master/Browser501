
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBC {

	public static void main(String[] args) {
		try{
			
			String name = "알파고";
			String age = "30";
			String salary = "3000";
			
			String driver = "oracle.jdbc.driver.OracleDriver";
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, "jsp", "jsp");
			Statement stmt = con.createStatement();
			String sql = "insert into join values('"+ name +"', '" + age + "', " + salary+ ")";
			int count = stmt.executeUpdate(sql);
			if(count > 0){
				System.out.println("데이터 insert 성공");
			}
			else{
				System.out.println("데이터 insert 실패");
			}
			
		}catch(ClassNotFoundException e){
			
			System.out.println("드라이버 이상");
		}catch(SQLException e){
			System.out.println(e.getMessage());
		}

	}

}
