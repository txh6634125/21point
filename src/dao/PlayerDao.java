package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import bean.Player;

public class PlayerDao {
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	public PlayerDao() {
		this.conn = DBUtil.getConnection();
	}
	
	public Player findAllByName(String playername) {
		
	}
}
