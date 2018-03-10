package db;
import java.sql.*;

public class Conn {
	private String URL="jdbc:mysql://192.168.235.36:3306/lime?user=lime&password=lime&useUnicode=true&characterEncoding=UTF8";
	
	public Connection connect(){
		Connection conn=null;
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(URL);
		}catch(ClassNotFoundException ex1){
			
		}catch(SQLException ex2){
			
		}
		
		return conn;
	}
	public ResultSet query(String sql){
		Conn conn=new Conn();
		ResultSet rs=null;
		try{
			Statement stmt=conn.connect().createStatement();
			rs=stmt.executeQuery(sql);
		}catch(SQLException e){
			
		}
		return rs;
	}
	
	public boolean exec(String sql){
		Conn conn=new Conn();
		boolean result=false;
		try{
			Statement stmt=conn.connect().createStatement();
			result=stmt.execute(sql);
		}catch(SQLException ex){
			
		}
		
		return result;
	}
}
