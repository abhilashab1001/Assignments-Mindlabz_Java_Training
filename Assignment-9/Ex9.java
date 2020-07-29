import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.util.StringTokenizer;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Ex9
 {

	public static void main(String[] args) throws IOException, Exception 
	{
	
		int roll;
		String name;
		int mark;
		int percentage;
		try
		{
			BufferedReader br = null;

			try 
			{

				String str;

				br = new BufferedReader(new FileReader("D:/ass8-9/read.txt"));
				
				while ((str = br.readLine()) != null) 
				{
				   System.out.println(str);

				   StringTokenizer tokens = new StringTokenizer(str, " ");
				   		while(tokens.hasMoreTokens())
				   		{

				   				
				   				name = tokens.nextToken();
				   				roll = Integer.parseInt(tokens.nextToken());
				   				mark = Integer.parseInt(tokens.nextToken());
				   				percentage = Integer.parseInt(tokens.nextToken());
				   				Connection con = null;
				   				Class.forName("oracle.jdbc.driver.OracleDriver");
				   				con =
				   				DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","system","system");
				   		      String sql = "INSERT INTO student VALUES (?,?,?,?)";
				   		   PreparedStatement stmt = con.prepareStatement(sql);
				   		stmt.setString(1,name);
				   		stmt.setInt(2,roll);
				   		stmt.setInt(3,mark);
				   		stmt.setInt(4, percentage);
				   		stmt.executeQuery();
				   		   System.out.println("Inserted records into the table...");
				        con.close();

				   		}
				   				
				   		if (br != null)
				br.close();
				   		
				System.out.println("Done");

			}
				} 
			catch (IOException e)
			{
				e.printStackTrace();
			}
			
		}
		finally 
		{
			System.out.println("Done");
		}
	}
}