package cn.com.taleair.connpool;

import java.sql.Connection;

/**
 *中国电子科技集团公司第三十二研究所
 *@author Joshua Ding
 *@time 2015年1月12日 下午4:45:21
 *@version 1.0.0
 *链接提供器
 *实现类需实现createConnection()方法提供单个数据库链接
 *连接池必须实现此类提供链接基本信息
 */
public abstract class VirtualConnectionProvider {
	/**
	 * 提供单个数据库链接
	 * @return
	 * Connection
	 */
	abstract Connection createConnection();
	/**
	 * 初始化链接数
	 * @return
	 */
	int getInitConnCount(){
		return 2;
	}
	/**
	 * 最小链接数
	 * @return
	 */
	int getMiniConnCount(){
		return 2;
	}
	/**
	 * 最大链接数
	 * @return
	 */
	int getMaxConnCount(){
		return 5;
	}
	
	String geTtestIsVaildStr(){
		return null;
	}
}
