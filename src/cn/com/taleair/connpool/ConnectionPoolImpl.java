package cn.com.taleair.connpool;

import java.sql.Connection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

/**
 *中国电子科技集团公司第三十二研究所
 *@author Joshua Ding
 *@time 2015年1月12日 下午5:58:05
 *@version 1.0.0
 */
@SuppressWarnings("unused")
class ConnectionPoolImpl implements ConnectionPool {
	private BlockingQueue<Connection> queue = null;
	private List<Connection> list = null;
	private VirtualConnectionProvider connProvider = null;
	private int initConnCount = 2;
	private int maxConnCount = 5;
	private int miniConnCount = 2;
	private String testIsVaildStr = null;
	public ConnectionPoolImpl(VirtualConnectionProvider connProvider) {
		this.connProvider = connProvider;
		this.initConnCount = connProvider.getInitConnCount();
		this.maxConnCount = connProvider.getMaxConnCount();
		this.miniConnCount = connProvider.getMiniConnCount();
		this.queue = new LinkedBlockingQueue<Connection>();
		this.list = new LinkedList<Connection>();
	}
	
	void init(){
		while(this.queue.size() < initConnCount){
			
		}
	}
	@Override
	public Connection getConnection() {
		return queue.poll();
	}

	@Override
	public void closeConn(Connection conn) {

	}

	@Override
	public void freeAllConnection() {

	}

}
