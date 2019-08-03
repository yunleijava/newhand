package com.yunlei.jdbc.util;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;



import com.alibaba.druid.pool.DruidDataSourceFactory;

//import com.alibaba.druid.pool.DruidDataSourceFactory;

/**
 * JDBC工具类1
 * 
 * @author mysql
 *
 */
public class JDBCUtil {

	public static DataSource ds = null;
	static {
	 try {
		 //读取配置文件
			Properties p = new Properties();
			FileInputStream in = new FileInputStream("C:\\Users\\mysql\\workspace\\JDBC-DAO\\resource\\gjdbc_config.properties");//绝对路径
			p.load(in);
			//读取文件
			//ds = BasicDataSourceFactory.createDataSource(p);//基本数据源工厂,传入配置文件p
			ds = DruidDataSourceFactory.createDataSource(p);//基本德鲁伊数据源工厂,传入配置文件p
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	}
	//获取数据源
    public static DataSource getDataSource(){
    	return ds;
    }
    
    
    public static Connection getConn() {

		// 2.连接数据库
		try {
			return ds.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static void close(Connection conn, Statement st, ResultSet rs) {
		// 5.释放资源
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
