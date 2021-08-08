import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InvoiceDB {
	int quantity;
	float originalBill;
	float finalBill;
	int gst;
	float z;
	String productName;
	public void Invoicedb(int quantity,float finalBill, String productName,String username){
	
			
try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/sample;create=true",
                    "user", "user");
            //String q=;
          Statement st = connection.createStatement();
      
           st.executeUpdate("create table invoice(userId varchar(100),productName varchar(100), quantity int, finalBill float)");
          
          PreparedStatement pstmt=connection.prepareStatement("insert into invoice values(?,?,?,?)");
           // pstmt.executeUpdate();
            pstmt.setString(1, username);
            pstmt.setString(2, productName);
            pstmt.setInt(3,quantity);
            pstmt.setFloat(4,finalBill);
            pstmt.executeUpdate();
            System.out.println("Table Created");
            
            
           // connection.close();
        } catch (ClassNotFoundException | SQLException se) {
            se.printStackTrace();
        }
	}
}