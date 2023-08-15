import java.sql.*;

public class JDBCClass {
    public static void main(String[] args) {
        try {
            //Getting the connection
            System.out.println("Please wait while connection to the db is being established.");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/xtolocalconndb", "root", "admin");
        /*"jdbc:mysql://localhost:3306/xtolocalconndb", "root", "admin"); ---*****This means
        jdbc connecting to msql on localhost server on port 3306 to database xtolocalconndb as root user with admin password
        */
            System.out.println("Establishing connection......");
            System.out.println("Connection established successfully!");

            //Creating a Statement object
            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM xtolocalconntable;");

            System.out.println("ID " + " FIRSTNAME " + "AGE");
            while (rs.next()) {
                System.out.println(+rs.getInt("user_id") + "\t" + rs.getString("firstname") + "\t" + rs.getString("age"));
            }
            // close ResultSet rs
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}





