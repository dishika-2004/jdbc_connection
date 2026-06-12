import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.*;

public class Demo {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String sql = "select product_name from product where product_id=6";

        String url="jdbc:postgresql://localhost:5433/dishika";
        String username="postgres";
        String password="1027";

        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        rs.next();
        String name = rs.getString(1);
        System.out.println(name);

        con.close();
    }
}
