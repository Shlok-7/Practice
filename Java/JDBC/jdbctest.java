
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class jdbctest{
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/test";
        String username="root";
        String password="root";

        try(Connection con=DriverManager.getConnection(url,username,password)){
            String sql="INSERT INTO employee(id,name,salary)VALUES(?,?,?)";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, 10);
            ps.setString(2, "Sandesh");
            ps.setDouble(3, 700000000);
            ps.executeUpdate();

            String readsql="SELECT *FROM employee";
            ResultSet rs= ps.executeQuery(readsql);

            while (rs.next()){
                System.out.println("name"+rs.getString("name")+"Salary"+rs.getDouble("salary"));
            }
        }catch(SQLException e){
           e.printStackTrace();
        }
    }
}
