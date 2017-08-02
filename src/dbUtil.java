
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbUtil {
	private static final String dbUrl="jdbc:mysql://localhost:3306/mysql";
	//连接到本机的数据库 
    private static final String dbUserName="root";
	 
    private static final String dbPassword="123456";
	 
    private static final String jdbcName="com.mysql.jdbc.Driver";
	 
	 public Connection getCon() {
		 try {
			Class.forName(jdbcName);
			System.out.println("连接数据库成功");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("连接数据库失败");
		}
		 Connection con = null;
		try {
			con = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
			System.out.println("获取数据库成功");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("获取数据库失败");
		}
		return con;
		
	 }
	 
	 public void close(Connection con)throws Exception{
		 if(con!=null){
			 con.close();
		 }
		 
	 }
	 public static void main(String[] args) {
	dbUtil dbUtil=new dbUtil();
	dbUtil.getCon();
	}
}
