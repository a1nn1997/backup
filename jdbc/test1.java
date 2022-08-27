import java.sql.*;

public class test1 {
    public static void main(String[] args) {
        try{
            //load the driver :
          Class.forName("com.mysql.cj.jdbc.Driver");
          // creating a connection
            String url="jdbc:mysql://localhost:3500/test1";
            String username="ann";
            String password="123";
            Connection con =DriverManager.getConnection(url,username,password);
            if(con.isClosed()){
                System.out.println("connection is still closed");
            }else {
                System.out.println("connection created");
            }

            //create a query
            String q="create table table1(tId int(20) primary key auto_increment, tName varchar(200) not null, tCity varchar(400))";

            //create a statement
            Statement stmt=con.createStatement();
            stmt.executeUpdate(q);
            System.out.println("table created in db");
            con.close();


        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
