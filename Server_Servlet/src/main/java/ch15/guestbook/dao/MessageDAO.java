package ch15.guestbook.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import ch15.guestbook.model.Message;
import ch15.jdbc.JdbcUtil;

//450
public class MessageDAO {

	private static MessageDAO instance = new MessageDAO();

	public static MessageDAO getInstance() {
		return instance;
	}

	public int insert(Connection conn, Message message) throws SQLException {

		PreparedStatement pstmt = null;

		String sql = "insert into guestbook_message values(message_id_seq.NEXTVAL,?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, message.getGuestName());
			pstmt.setString(2, message.getPassword());
			pstmt.setString(3, message.getMessage());

			return pstmt.executeUpdate();

		} finally {
			JdbcUtil.close(pstmt);
		}
	}

	public Message select(Connection conn, int messageId) throws SQLException {

		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			String sql = "select * from guestbook_message where message_id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, messageId);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				return makeMessageFromResultSet(rs);
			} else {
				return null;
			}
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
	}

	private Message makeMessageFromResultSet(ResultSet rs) throws SQLException {

		Message message = new Message();
		message.setId(rs.getInt("message_id"));
		message.setGuestName(rs.getString("guest_name"));
		message.setPassword(rs.getString("password"));
		message.setMessage(rs.getString("message"));

		return message;
	}

	public int selectCount(Connection conn) throws SQLException {

		Statement stmt = null;
		ResultSet rs = null;

		try {
			stmt = conn.createStatement();
			String sql = "select count(*) from guestbook_message";
			rs = stmt.executeQuery(sql);
			rs.next();
			// 총 메시지 갯수 리턴
			return rs.getInt(1);
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(stmt);

		}
	}

	// 451:80
	public List<Message> selectList(Connection conn, int firstRow, int endRow) throws SQLException {

		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			String sql = "select * from (select rownum as rnum, message_id, guest_name,password,message from guestbook_message)a where a.rnum >=? and a.rnum <= ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, firstRow);
			pstmt.setInt(2, endRow);
				
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				List<Message> messageList = new ArrayList<Message>();
				
				do {
					messageList.add(makeMessageFromResultSet(rs));
				}while(rs.next());
				
				return messageList;
			} else {
				return Collections.emptyList();
			}
			
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
	}

	public int delete(Connection conn, int messageId) throws SQLException {

		PreparedStatement pstmt = null;

		try {
			String sql = "delete from guestbook_message where message_id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, messageId);

			return pstmt.executeUpdate();

		} finally {

			JdbcUtil.close(pstmt);
		}
	}

}
