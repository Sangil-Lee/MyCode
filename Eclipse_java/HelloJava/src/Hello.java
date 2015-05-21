import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;
import java.awt.FlowLayout;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con = null;
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/mytest", "root", "qwer1234");
			java.sql.Statement st = null;
			ResultSet rs = null;
			st=con.createStatement();
			
//			String strsql = "create TABLE SetID_2 (idx mediumint not null auto_increment, partname VARCHAR(64) not null, filename VARCHAR(64), PRIMARY KEY (idx) )";
	//		st.executeUpdate(strsql);
    
          //Show tables;
			rs=st.executeQuery("SHOW tables");
			
			if(st.execute("SHOW tables")) {
				rs = st.getResultSet();
			}
			
			while(rs.next()) {
				String str = rs.getNString(1);
				if(str.compareTo("setid_2")==0)
					System.out.println(str);
			}

			
			
			//Delete from table;
			//String strsql = "delete from mypictures where id = 1";
			//st.executeUpdate(strsql);
			
		
			//Select from table;
/*			String strsql = "select id, name, photo from mypictures where id = 1";
			rs = st.executeQuery(strsql);
			
			while(rs.next()){
		         //Retrieve by column name
		         int id  = rs.getInt("id");
		         String name = rs.getString("name");
		         InputStream img = rs.getBinaryStream("photo");
 
        	    ImageInputStream imageInput = null;
        	    BufferedImage bufImage = null;
				try {
					imageInput = ImageIO.createImageInputStream(img);
					bufImage = ImageIO.read(imageInput);
			        ImageIcon icon=new ImageIcon(bufImage);
		            JFrame frame=new JFrame();
		            frame.setLayout(new FlowLayout());
		            frame.setSize(bufImage.getWidth(),bufImage.getHeight());
		            JLabel lbl=new JLabel();
		            lbl.setIcon(icon);
		            frame.add(lbl);
		            frame.setVisible(true);
		            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		          
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		         
		         //Display values
		         System.out.print("ID: " + id);
		         System.out.print(", Nmae: " + name);
		         System.out.print(", Image Height: " + bufImage.getHeight());
		         System.out.println(", Image Width: " + bufImage.getWidth());
		    }
		   rs.close();*/
			
			/*
			On your ResultSet call:

				Blob imageBlob = resultSet.getBlob(yourBlobColumnIndex);
				InputStream binaryStream = imageBlob.getBinaryStream(0, imageBlob.length());
				Alternatively, you can call:

				byte[] imageBytes = imageBlob.getBytes(1, (int) imageBlob.length());
				As BalusC noted in his comment, you'd better use:

				InputStream binaryStream = resultSet.getBinaryStream(yourBlobColumnIndex);
				And then the code depends on how you are going to read and embed the image.*/
				
		}catch(SQLException sqex){
			System.out.println("SQLException: " + sqex.getMessage());
			System.out.println("SQLState: " + sqex.getSQLState());
			
		}
		
		
		System.out.println("Hello Java World!!");

	}

}
