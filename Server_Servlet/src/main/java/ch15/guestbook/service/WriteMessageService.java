package ch15.guestbook.service;

import java.sql.Connection;
import java.sql.SQLException;

import ch15.guestbook.dao.MessageDAO;
import ch15.guestbook.model.Message;
import ch15.jdbc.JdbcUtil;
import ch15.jdbc.connection.ConnectionProvider;

//458
public class WriteMessageService {

	private static WriteMessageService instance = new WriteMessageService();
	
	public static WriteMessageService getInstance() {
		return instance;
	}
	
	private WriteMessageService(){}
	
	public void write(Message message) {
		Connection conn = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			MessageDAO messageDao = MessageDAO.getInstance();
			messageDao.insert(conn, message);
		
		}catch(SQLException e) {
			throw new ServiceException("메시지 등록 실패: " + e.getMessage(), e);
		}finally {
			JdbcUtil.close(conn);
		}
		
	}
}
