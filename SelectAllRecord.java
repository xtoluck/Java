
import java.sql.DriverManager;
        import java.sql.Connection;
        import java.sql.Statement;
        import java.sql.SQLException;
        import java.sql.ResultSet;
  class SelectAllRecord{
    //JDBC driver name and database URL
    //static String driverName = "com.mysql.jdbc.Driver";
   //static String driverName = "com.mysql.cj.jdbc.Driver";
    static String driverName = "mysql-connector-j-8.0.33.jar";
    static String url = "jdbc:mysql://127.0.0.1:3306";

    // defined and set value in  dbName, userName and password variables
    static String dbName = "xtoluckdb";
    static String userName = "root";
    static String password = "Fgntry@123";

    public static void main(String[] args){
        // create Connection con, and Statement stmt
        Connection con=null;
        Statement stmt=null;
        try{
            Class.forName(driverName).getDeclaredConstructor().newInstance();
            con = DriverManager.getConnection(url+dbName, userName, password);
            try{
                stmt = con.createStatement();
                String query = "SELECT * FROM user";
                ResultSet rs=stmt.executeQuery(query);
                System.out.println("user_id"+"\t"+"user_name");
                //Extact result from ResultSet rs
                while(rs.next()){
                    System.out.println(""+rs.getInt("user_id")+"\t"+rs.getString("user_name"));
                }
                // close ResultSet rs
                rs.close();
            } catch(SQLException s){
                s.printStackTrace();
            }
            // close Connection and Statement
            con.close();
            stmt.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}