package ch15.guestbook.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import ch15.guestbook.model.Message;

//450
public class MessageDAO {

	public int insert(Connection conn, Message message) {
		
		String sql = "insert into guest_message values('message_id_seq.NEXTVAL',?,?,?)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}
	
	//451:80
	public List<Message> selectList(Connection conn, int firstRow, int endRow){
		
		String sql = "select * from () where rnum >= ?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}
