import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertPicture 
{
	  public static void main(String[] args) throws Exception, IOException, SQLException 
	  {
		    Class.forName("org.gjt.mm.mysql.Driver");
		    Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/mytest", "root", "qwer1234");
		    String INSERT_PICTURE = "insert into MyPictures(id, name, photo) values (?, ?, ?)";

		    FileInputStream fis = null;
		    PreparedStatement ps = null;
		    try {
		      conn.setAutoCommit(false);
		      File file = new File("C:/Users/Sangil/workspace/Picture/bin/myPhoto.png");
		      fis = new FileInputStream(file);
		      ps = conn.prepareStatement(INSERT_PICTURE);
		      ps.setString(1, "001");
		      ps.setString(2, "name");
		      ps.setBinaryStream(3, fis, (int) file.length());
		      //ps.setBlob(3, fis);
		      System.out.println("Size: " + file.length());
		      ps.executeUpdate();
		      conn.commit();
		    }catch(SQLException sqex){
				System.out.println("SQLException: " + sqex.getMessage());
				System.out.println("SQLState: " + sqex.getSQLState());
				
				ps.close();
				fis.close();
			} 
		}
}
