package cn.com.taleair.connpool;

import java.sql.Connection;

/**
 *中国电子科技集团公司第三十二研究所
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
