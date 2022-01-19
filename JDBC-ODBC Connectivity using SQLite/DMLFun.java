import java.sql.*;
import java.util.*;

public class DMLFun {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:F:\\SQLite\\mydemo.db");
        PreparedStatement stm = con.prepareStatement("insert into students values(?,?,?,?)");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student details");
        int r = sc.nextInt();
        String name = sc.next();
        String city = sc.next();
        int dno = sc.nextInt();

        stm.setInt(1,r);
        stm.setString(2,name);
        stm.setString(3,city);
        stm.setInt(4,dno);

        stm.executeUpdate();

        stm.close();
        con.close();
    }
}
