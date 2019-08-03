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
 * JDBC������1
 * 
 * @author mysql
 *
 */
public class JDBCUtil {

	public static DataSource ds = null;
	static {
	 try {
		 //��ȡ�����ļ�
			Properties p = new Properties();
			FileInputStream in = new FileInputStream("C:\\Users\\mysql\\workspace\\JDBC-DAO\\resource\\gjdbc_config.properties");//����·��
			p.load(in);
			//��ȡ�ļ�
			//ds = BasicDataSourceFactory.createDataSource(p);//��������Դ����,���������ļ�p
			ds = DruidDataSourceFactory.createDataSource(p);//������³������Դ����,���������ļ�p
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	}
	//��ȡ����Դ
    public static DataSource getDataSource(){
    	return ds;
    }
    
    
    public static Connection getConn() {

		// 2.�������ݿ�
		try {
			return ds.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static void close(Connection conn, Statement st, ResultSet rs) {
		// 5.�ͷ���Դ
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
