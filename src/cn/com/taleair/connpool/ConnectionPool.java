package cn.com.taleair.connpool;

import java.sql.Connection;

/**
 *cn.com.taleair
 *@author Joshua Ding
 *@time 2015年1月12日 下午5:34:25
 *@version 1.0.0
 *数据库连接池
 */
public interface ConnectionPool {
	public Connection getConnection();
	public void closeConn(Connection conn);
	public void freeAllConnection();
}
