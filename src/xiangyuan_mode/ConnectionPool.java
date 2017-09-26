package xiangyuan_mode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

public class ConnectionPool  {

     private Vector<Connection> pool;
     private String url=":jdbc:mysql://localhost:3306/test";
     private String username="root";
     private String password="root";
     private String driverClassName="com.mysql.jdbc.Driver";
     private int poolsize=100;
     private static ConnectionPool instance=null;
     Connection conn=null;
     private ConnectionPool(){
    	 pool=new Vector<Connection>(poolsize);
    	 for(int i=0;i<poolsize;i++){
    		 try {
				Class.forName(driverClassName);
			
					try {
						conn=DriverManager.getConnection(url,username,password);
						pool.add(conn);
						} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	 }
     }
     public synchronized void release(){
    	 pool.add(conn);
     }
     public synchronized Connection getConnection(){
    	 if(pool.size()>0){
    		 Connection connection=pool.get(0);
    		 pool.remove(conn);
    		 return connection;
    	 }
    	 else return null;
     }

}
